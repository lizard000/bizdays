package com.kolejnik.bizdays;

import com.kolejnik.bizdays.calendar.BusinessCalendar;
import com.kolejnik.bizdays.calendar.PolishBusinessCalendar;
import com.kolejnik.bizdays.holiday.CronHoliday;
import com.kolejnik.bizdays.schedule.BusinessSchedule;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        BusinessCalendar calendar = PolishBusinessCalendar.getInstance();

        System.out.println("Next business day: " + calendar.nextBusinessDay());

        int days = calendar.businessDaysBetween(LocalDate.of(2016, 1, 1), LocalDate.of(2016, 12, 31));
        System.out.println("Business days in 2016: " + days);

        BusinessSchedule schedule = new BusinessSchedule(calendar);

        System.out.println(schedule.businessDayStartAfter(LocalDateTime.now()));
        System.out.println(schedule.businessDayEndAfter(LocalDateTime.now()));
        System.out.println(schedule.isBusinessTime(LocalDateTime.now()));

        System.out.println(schedule.plus(LocalDateTime.now(), 0));
        System.out.println(schedule.plus(LocalDateTime.now(), 4));
        System.out.println(schedule.plus(LocalDateTime.now(), 16));
        System.out.println(schedule.plus(LocalDateTime.now(), 145));
        System.out.println(schedule.minus(LocalDateTime.now(), 0));
        System.out.println(schedule.minus(LocalDateTime.now(), 4));
        System.out.println(schedule.minus(LocalDateTime.now(), 16));
        System.out.println(schedule.minus(LocalDateTime.now(), 129));

        System.out.println(CronHoliday.SUNDAY);
    }
}
