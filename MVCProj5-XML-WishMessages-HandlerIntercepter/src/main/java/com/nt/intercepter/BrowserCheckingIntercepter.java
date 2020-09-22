package com.nt.intercepter;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class BrowserCheckingIntercepter implements HandlerInterceptor {
@Override
public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
		throws Exception {
	System.out.println("BrowserCheckingIntercepter.preHandle()");
	RequestDispatcher rd=null;
	PrintWriter pw=null;
	String browser=null;
	//get writer
	pw=res.getWriter();
	//set responce type
	res.setContentType("text/html");
	//get current browser
	browser=req.getHeader("user-agent");
	if(browser.indexOf("Chrome")==-1) {
		rd=req.getRequestDispatcher("browser.jsp");
		rd.forward(req, res);
		return false;
	}
	else
	{
	return true;
	}
}
}
