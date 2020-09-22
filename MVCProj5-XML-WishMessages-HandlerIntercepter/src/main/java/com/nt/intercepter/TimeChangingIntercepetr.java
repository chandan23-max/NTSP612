package com.nt.intercepter;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeChangingIntercepetr implements HandlerInterceptor {
@Override
public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler
		) throws Exception {
	int hour=0;
	RequestDispatcher rd=null;
	Calendar calendar=Calendar.getInstance();
	hour=calendar.get(Calendar.HOUR_OF_DAY);
	//check the timing
	if(hour<9||hour>17) {
		rd=req.getRequestDispatcher("time.jsp");
		rd.forward(req, res);
		return false;
	}
	else {
		return true;
	}
}
}
