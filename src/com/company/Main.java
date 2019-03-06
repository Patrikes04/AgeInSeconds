package com.company;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(dateFormat.format(calendar.getTime()));
        int nowYear=calendar.get(Calendar.YEAR);
        int nowMonth=calendar.get(Calendar.MONTH)+1;
        int nowDay=calendar.get(Calendar.DAY_OF_MONTH);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj rok urodzenia");
        int birthYear=scanner.nextInt();
        System.out.println("Podaj miesiąc urodzenia");
        int birthMonth=scanner.nextInt();
        System.out.println("Podaj dzień urodzenia");
        int birthDay=scanner.nextInt();
	    DateTime now= new DateTime(nowYear,nowMonth,nowDay,0,0,0,0);
	    DateTime birthDate= new DateTime(birthYear,birthMonth,birthDay,0,0,0,0);
	    int hours= Hours.hoursBetween(birthDate,now).getHours();
	    int days= Days.daysBetween(birthDate,now).getDays();
        System.out.println("You live: "+hours +" hours");
        System.out.println("You live: "+days+" days");
        System.out.println("You live: "+hours*60+" minutes");
        System.out.println("You live: "+hours*60*60+" seconds");
    }
}
