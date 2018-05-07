package com.wxc.serviceribbon.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class RequestFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(RequestFilter.class);

	/**
	 * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
	 */
	@Override
	public Object run() {
		RequestContext rc = RequestContext.getCurrentContext();
		HttpServletRequest request = rc.getRequest();
		log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		Object accessToken = request.getParameter("token");
		if(accessToken == null){
			log.warn("token is emtry.");
			rc.setSendZuulResponse(false);
			rc.setResponseStatusCode(401);
			try {
				rc.getResponse().getWriter().write("token is emptry.");
			} catch (IOException e) {}
			return null;
		}
		log.info("access ok");
		return null;
	}

	/**
	 * 逻辑判断，是否要过滤，本文true,永远过滤
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 过滤的顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * 返回一个字符串代表过滤器的类型
	 * pre：路由之前 
	 * routing：路由之时 
	 * post： 路由之后 
	 * error：发送错误调用
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}
