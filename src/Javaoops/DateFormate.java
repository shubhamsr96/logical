package Javaoops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat fs = new SimpleDateFormat("d/M/yyyy  hh:mm:ss");
		System.out.println(d);
		System.out.println(f.format(d));
		System.out.println(fs.format(d));
		
	}

}
