package Javaoops;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cl= Calendar.getInstance();
		SimpleDateFormat fs = new SimpleDateFormat("d/M/yyyy  hh:mm:ss");
		System.out.println(fs.format(cl.getTime()));
		System.out.println(cl.get(Calendar.ZONE_OFFSET));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_YEAR));
		
		
	}

}
