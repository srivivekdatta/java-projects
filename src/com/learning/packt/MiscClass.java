package com.learning.packt;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MiscClass {

	public static void main(String[] args) {
		ZonedDateTime zdt = null;
		Date d = new Date();
		
		System.out.println(d);
		
		LocalDateTime d1 = LocalDateTime.now();
		System.out.println(d1.format(DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm:ss a")));
		
		Instant i = Instant.now(); // revisit instant time class
		System.out.println(i);
		
		// print days between start and end date
		// start
		/*
		 * LocalDate startLocalDate = LocalDate.of(2019, 2, 1); LocalDate endLocalDate =
		 * LocalDate.of(2019, 2, 21);
		 * 
		 * for (LocalDate date = startLocalDate; date.isBefore(endLocalDate); date =
		 * date.plusDays(1)) {
		 * 
		 * // do something with this day System.out.println(date); }
		 */
		//end
		
		//calculate age
		LocalDate borndate = LocalDate.of(1993, 03, 12);
		LocalDate today = LocalDate.now();
		
		Period periodBetween = Period.between(borndate, today);
		
		System.out.println(periodBetween.getYears() + " yrs " + periodBetween.getMonths() + " months "+ periodBetween.getDays()+ " days ");
	}
}
