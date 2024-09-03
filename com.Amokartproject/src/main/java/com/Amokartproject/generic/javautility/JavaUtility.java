package com.Amokartproject.generic.javautility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/***
 * this class contains reusable methods to perform java related operations
 */

public class JavaUtility {

	/***
	 * This method generate random method within specified limit
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit)
	{
	Random r=	new Random();
	int ranDomNumber=r.nextInt(limit);
	return ranDomNumber;
	
	
	
	}
	
	/***
	 * Method to get system date
	 * @return
	 */
	public String getSystemDateYYYYDDMM()
	{
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date=sdf.format(dateobj);
		return date;
		
	}
	public String getRequriedDateYYYYDDMM(int days)
	{
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days);
		String reqDate=sim.format(cal.getTime());
		return reqDate;
		
	}
	
	/***
	 * Method to fetch current date and time
	 * @return
	 */
		public String getCurrentTime()
		{
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			return sdf.format(date);
		}
}
