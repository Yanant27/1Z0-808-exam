package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class TestLocalTimeCreation {

	public static void main(String[] args) {
		/*
		 * second and nano second can be added to LocalTime created with Hm static method.
		 */
//		LocalTime localTimeHm = LocalTime.of(3, 30);
//		LocalTime localTimeHms = LocalTime.of(3, 40, 50);
//		LocalTime localTimeHmsn = LocalTime.of(2, 45, 56, 1234);
//		System.out.println(localTimeHmsn); // 02:45:56.000001234
//		System.out.println(localTimeHm.plusNanos(12)); // 03:30:00.000000012
//		System.out.println(localTimeHm);
//		
//		LocalDate localDate1 = LocalDate.of(2022, 3, 24);
//		
//		LocalDateTime localDateTime = LocalDateTime.of(localDate1, localTimeHmsn);
//		System.out.println(localDateTime);
//		
//		DateTimeFormatter fdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//		DateTimeFormatter ftime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//		DateTimeFormatter fdatetime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM);
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 2);
		LocalTime time = LocalTime.of(1, 2, 3, 111);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime));
		System.out.println(mediumF.format(dateTime));
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss");
		System.out.println(dateTime.format(f));
		StringBuilder s = new StringBuilder("12");
//		s.insert(10, "a");
		s.length();
		String str = "12";str.concat("!!!");
		char[]c = new char[2];
		List list = new ArrayList<>();
		list.size();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.reverse());
		sb.toString();

	}

}
