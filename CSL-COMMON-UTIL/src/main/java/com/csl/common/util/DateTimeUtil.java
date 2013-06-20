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

    public static Boolean isSameDateWithTimeIgnore(Date date1, Date date2) {
        return DateUtils.isSameDay(date1, date2);
    }

    public static Boolean isSameDateTime(Date date1, Date date2) {
        return DateUtils.isSameInstant(date1, date2);
    }

    public static Integer getAge(Date birthdate) {
        DateMidnight date1 = new DateMidnight(birthdate);
        DateTime now = new DateTime();
        return Years.yearsBetween(date1, now).getYears();
    }

    public static Integer getTotalDayDifference(Date date1, Date date2) {
        return Days.daysBetween(new DateMidnight(date1), new DateMidnight(date2)).getDays();
    }

    public static Integer getTotalMonthDifference(Date date1, Date date2) {
        return Months.monthsBetween(new DateMidnight(date1), new DateMidnight(date2)).getMonths();
    }

    public static Integer getToalYearDifference(Date date1, Date date2) {
        return Years.yearsBetween(new DateMidnight(date1), new DateMidnight(date2)).getYears();
    }

    public static Integer getTotalWorkingDay(Date startDate, Date endDate, int totalPulicHoliday, int totalAnualLeave) {
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
        return totalWorkingDays - totalAnualLeave - totalPulicHoliday;
    }
}
