/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import com.csl.common.CommonUtilConstant;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;
import org.joda.time.Years;

/**
 *
 * @author Deni Husni FR
 */
public class DateTimeUtil {
    
    /**
     * <p>Get Past or Future date based on parameter amount.</p>
     * <p><b>parameter amount :</b> use negative symbol to get past date, use positive symbol to get future date</p>
     * <p><b>parameter param :</b> the type of times that will be added</p>
     * <p><b>param type :</b></p>
     * <ul>
     * <li>day</li>
     * <li>hours</li>
     * <li>millisecond</li>
     * <li>minutes</li>
     * <li>month</li>
     * <li>second</li>
     * <li>year</li>
     * <li>week</li>
     * </ul>
     * 
     * @return Date Date 
     * @param date Date reference
     * @param amount Integer reference
     * @param param String reference
     */
    public static Date getDateFromWithParam(Date date, int amount, String param) {
        if (param.equalsIgnoreCase(CommonUtilConstant.DAY)) {
            return DateUtils.addDays(date, amount);
        }
        if (param.equalsIgnoreCase(CommonUtilConstant.HOURS)) {
            return DateUtils.addHours(date, amount);
        }
        if (param.equalsIgnoreCase(CommonUtilConstant.MILLISECOND)) {
            return DateUtils.addMilliseconds(date, amount);
        }
        if (param.equalsIgnoreCase(CommonUtilConstant.MINUTES)) {
            return DateUtils.addMinutes(date, amount);
        }
        if (param.equalsIgnoreCase(CommonUtilConstant.MONTH)) {
            return DateUtils.addMonths(date, amount);
        }
        if (param.equalsIgnoreCase(CommonUtilConstant.SECOND)) {
            return DateUtils.addSeconds(date, amount);
        }

        if (param.equalsIgnoreCase(CommonUtilConstant.YEAR)) {
            return DateUtils.addYears(date, amount);
        }

        if (param.equalsIgnoreCase(CommonUtilConstant.WEEK)) {
            return DateUtils.addWeeks(date, amount);
        }
        return null;
    }

    /**
     * Checking from two date objects, will return true if the date have the same value.
     * @return Boolean 
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Boolean isSameDateWithTimeIgnore(Date date1, Date date2) {
        return DateUtils.isSameDay(date1, date2);
    }

    /**
     * Checking from two date objects ( included time ), will return true if the date have the same value.
     * @return Boolean 
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Boolean isSameDateTime(Date date1, Date date2) {
        return DateUtils.isSameInstant(date1, date2);
    }

    /**
     * get total times (Age) based on parameter date
     * @return Integer
     * @param birthDate Date reference
     */
    public static Integer getAge(Date birthdate) {
        DateMidnight date1 = new DateMidnight(birthdate);
        DateTime now = new DateTime();
        return Years.yearsBetween(date1, now).getYears();
    }

    /**
     * get total days, between two date object
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getTotalDayDifference(Date date1, Date date2) {
        return Days.daysBetween(new DateMidnight(date1), new DateMidnight(date2)).getDays();
    }

    /**
     * get total Months, between two date object
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getTotalMonthDifference(Date date1, Date date2) {
        return Months.monthsBetween(new DateMidnight(date1), new DateMidnight(date2)).getMonths();
    }

    /**
     * get total years, between two date object
     * @return Integer
     * @param date1 Date reference
     * @param date2 Date reference
     */
    public static Integer getToalYearDifference(Date date1, Date date2) {
        return Years.yearsBetween(new DateMidnight(date1), new DateMidnight(date2)).getYears();
    }

    /**
     * get total working days 
     * @return Integer
     * @param starDate Date reference
     * @param endDate Date reference
     * @param totalPublicHoliday int, total of public holiday
     * @param totalAnnualLeave int, total of annual leave
     */
    public static Integer getTotalWorkingDay(Date startDate, Date endDate, int totalPublicHoliday, int totalAnnualLeave) {
        DateTime start = new DateTime(startDate);
        DateTime end = new DateTime(endDate);
        int satSun = 0;
        int numOfDays = 0;
        DateTime iterate = start;
        if (iterate.getDayOfWeek() == 6 | iterate.getDayOfWeek() == 7) {
            ++satSun;
        }
        ++numOfDays;

        while (!iterate.isEqual(end)) {
            ++numOfDays;
            iterate = iterate.plusDays(1);
            if (iterate.getDayOfWeek() == 6 | iterate.getDayOfWeek() == 7) {
                ++satSun;
            }
        }
        int totalWorkingDays = numOfDays - satSun;
        return totalWorkingDays - totalAnnualLeave - totalPublicHoliday;
    }
}
