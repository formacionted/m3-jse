package com.jse.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Clase para trabajar con fechas en Java
 * 
 * LocalDate Represents a date (year, month, day (yyyy-MM-dd)) LocalTime
 * Represents a time (hour, minute, second and milliseconds (HH-mm-ss-zzz))
 * LocalDateTime Represents both a date and a time (yyyy-MM-dd-HH-mm-ss.zzz)
 * DateTimeFormatter Formatter for displaying and parsing date-time objects
 * 
 * @see <a href="https://www.tutorialspoint.com/java8/java8_datetime_api.htm"> DATE API </a>
 */
public class Fechas {

	public static void main(String[] args) {

		// mostrar la fecha actual
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("=============");

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println("=============");


		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println("=============");


		/*
		 * Formatear una fecha
		 */
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = localDateTime.format(dateTimeFormatter);
		System.out.println("After formatting: " + formattedDate);
		System.out.println("=============");


		 Month month = localDateTime.getMonth();
	      int day = localDateTime.getDayOfMonth();
	      int seconds = localDateTime.getSecond();
			
	      System.out.println("Month: " + month +", day: " + day +", seconds: " + seconds);
			System.out.println("=============");

	      LocalDateTime date2 = localDateTime.withDayOfMonth(10).withYear(2012);
	      System.out.println("date2: " + date2);
			System.out.println("=============");

	      //12 december 2014
	      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
	      System.out.println("date3: " + date3);
			System.out.println("=============");

	      //22 hour 15 minutes
	      LocalTime date4 = LocalTime.of(22, 15);
	      System.out.println("date4: " + date4);
			System.out.println("=============");

	      //parse a string
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date5: " + date5);
			System.out.println("=============");

	}

}
