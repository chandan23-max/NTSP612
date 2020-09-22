package com.nt.service;

import java.util.Calendar;
import java.util.Locale;

public class WishMessageServImpl implements WishMessageService {

	@Override
	public String getWish() {
		int hour=0;
		Calendar calender=null;
		calender=Calendar.getInstance();
        hour=calender.get(Calendar.HOUR_OF_DAY);
        if(hour<12)
        	return "Good Morning::";
        else if(hour<16)
        	return "Good Afternoon";
        else if(hour<20)
        	return "Good Evening";
        			
        	else
        		return "Good Night";
		
	}

}
