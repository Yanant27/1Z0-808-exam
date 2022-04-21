package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TestLocalDateCreation {

	public static void main(String[] args) {
		/*
		 * LocalDateTime/ LocalDate/ LocalTime
		 * 1. They don't have constructors.
		 * 2. They are immutable
		 * 3. Hms can't be added to LocalDate
		 */
		LocalDate localDate1 = LocalDate.of(2022, 3, 24);
		LocalDate localDate2 = LocalDate.of(2022, Month.MARCH, 26);
		
//		localDate = LocalDate.of(2022, 13, 12); // DateTimeException, invalid month - 13
		
		LocalDate localDate = LocalDate.of(0000, 11, 11); // No Exception
		
//		localDate = LocalDate.of(0000, 00, 11); // DateTimeException, invalid month - 00
		
//		localDate = LocalDate.of(0000, 11, 00); // DateTimeException, invalid DayOfMonth - 13
		
		// Test Immutable
		System.out.println("Adding day, week, month, year to date ");
		System.out.println("Before Adding : " + localDate2);
		// The following operations just add to the original date.
		System.out.println(localDate2.plusDays(1));
		System.out.println(localDate2.plusMonths(1));
		System.out.println(localDate2.plusWeeks(1));
		System.out.println(localDate2.plusYears(1));
		System.out.println("Origin Date : " + localDate2);
		
		
		System.out.println("---------------------------------------");
		
		// Test chain methods
		System.out.println("Before chaining : " + localDate2);
		System.out.println("Apply method chaining :  " + 
		localDate2.plusDays(1).plusWeeks(1).plusMonths(1).plusYears(1));
		System.out.println("Origin Date : " + localDate2);
		
		System.out.println("---------------------------------------");
		
		// Test comparison
		if (localDate1.isBefore(localDate2)) {
			System.out.println("LocalDate 1 is earlier");
		} else if (localDate1.isAfter(localDate2)) {
			System.out.println("LocalDate 2 is earlier");
		} else {
			System.out.println("Same !");
		}
	}

}
