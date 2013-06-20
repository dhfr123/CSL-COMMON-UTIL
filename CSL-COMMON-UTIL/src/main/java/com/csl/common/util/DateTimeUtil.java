/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import com.csl.common.CommonUtilConstant;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

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
}
