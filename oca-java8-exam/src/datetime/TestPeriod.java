package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class TestPeriod {

	public static void main(String[] args) {
		/*
		 * Period is immutable
		 * Can't be added to LocalTime object (eg. localTime.plus(periodDays)
		 * Period doesn't allow chaining and only the last Period method called is effective
		 * eg. Period p = Period.ofDays(1).ofYears(2);
		 * 	   date = date.minus(p);
		 * 	   only 2 years will be subtracted.
		 */
		LocalDate startDate = LocalDate.of(2022, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 1);
		Period periodDays = Period.ofDays(10);
		Period periodWeek = Period.ofWeeks(1);
		Period periodMonth = Period.ofMonths(1);
		Period periodYear = Period.ofYears(1);
		while (startDate.isBefore(endDate)) {
			startDate = startDate.plus(periodYear);
			System.out.println("Year End Sales !");
		}

//		while (startDate.isBefore(endDate)) {
//			startDate = startDate.plus(periodMonth);
//			System.out.println("Monthly Sales !");
//		}
//
//		while (startDate.isBefore(endDate)) {
//			startDate = startDate.plus(periodWeek);
//			System.out.println("Weekly Sales !");
//		}
//
//		while (startDate.isBefore(endDate)) {
//			startDate = startDate.plus(periodDays);
//			System.out.println("10 Days Sales !");
//		}
	}

}
