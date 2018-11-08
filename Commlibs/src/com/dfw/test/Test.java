package com.dfw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {

		
	}
	public void ConvertSpecialDate()
	{
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM月 -yy HH.mm.ss.S a");
		String s = "09-3月 -18 08.00.00.000000000 上午";
		try {
			Date d = format1.parse(s);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			System.out.print(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
			System.out.print(c.get(Calendar.HOUR_OF_DAY)+"点"+c.get(Calendar.MINUTE)+"分"+c.get(Calendar.SECOND)+"秒");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
