package additional_function;

import java.text.SimpleDateFormat;
import java.util.*;

public class Util {

	public static String getCurrentDate(String fmt) {
		// TODO Auto-generated constructor stub
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Util.getCurrentDate("yyyyMMdd"));

	}

}
