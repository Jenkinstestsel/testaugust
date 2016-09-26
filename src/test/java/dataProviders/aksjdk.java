package dataProviders;

import java.text.SimpleDateFormat;
import java.util.Date;

public class aksjdk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		System.out.println(simpleDateFormat.format(date));
		
		
		System.out.println(date);
		
	}

}
