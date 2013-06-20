/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Class DateFormatter dimanage by Spring.
 * <p> Class untuk memformat Date dan memparsing String menjadi Date.
 * @author Deni Husni Fahri Rizal
 */
public class DateFormatter {

    private String defaultLocale;
    private String datePattern;
    private String timePattern;
    private String monthPattern;
    private String yearPattern;
    private String dayPattern;
    private String dateFullPattern;
    private String monthAndYearPatern;

    public String getMonthAndYearPatern() {
        return monthAndYearPatern;
    }

    public void setMonthAndYearPatern(String monthAndYearPatern) {
        this.monthAndYearPatern = monthAndYearPatern;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    public String getTimePattern() {
        return timePattern;
    }

    public void setTimePattern(String timePattern) {
        this.timePattern = timePattern;
    }

    public String getMonthPattern() {
        return monthPattern;
    }

    public void setMonthPattern(String monthPattern) {
        this.monthPattern = monthPattern;
    }

    public String getYearPattern() {
        return yearPattern;
    }

    public void setYearPattern(String yearPattern) {
        this.yearPattern = yearPattern;
    }

    public String getDayPattern() {
        return dayPattern;
    }

    public void setDayPattern(String dayPattern) {
        this.dayPattern = dayPattern;
    }

    public String getDateFullPattern() {
        return dateFullPattern;
    }

    public void setDateFullPattern(String dateFullPattern) {
        this.dateFullPattern = dateFullPattern;
    }

     /**
     * 
     * <p>Get Date format with default locale, the return value is string with default date pattern (dd-MMMM-yyyy).</p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with pattern date dd-MMMM-yyyy
     * @param date Date
     */
    public String getDateAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(datePattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * 
     * <p>Get Date format with specific locale, the return value is string with default date pattern (dd-MMMM-yyyy) </p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with pattern date dd-MMMM-yyyy 
     * @param date Date
     * @param locale Locale
     */
    public String getDateAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(datePattern, locale).format(date);
    }

    /**
     * <p>Get Date format with default locale, the return value is string with default full pattern (dd-MMMM-yy|hh:mm a)</p>
     * <br/> 
     * </p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default full date pattern dd-MMMM-yy|hh:mm a
     * @param date Date
     */
    public String getDateFullAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(dateFullPattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Get Date format with specific locale, the return value is string with default full date pattern (dd-MMMM-yy|hh:mm a)</p>
     * <br/> 
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default full date pattern dd-MMMM-yy|hh:mm a 
     * @param date Date
     * @param locale Locale
     */
    public String getDateFullAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(dateFullPattern, locale).format(date);
    }

    /**
     * <p>Get time format with default locale, the return value is string with default time pattern (hh:mm:ss)</p>
     * <br/>
     * <p>for value of default locale and default time pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default time pattern hh:mm:ss
     * @param date Date
     */
    public String getTimeAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(timePattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Get time format with default specific locale, the return value is string with default time pattern (hh:mm:ss)</p>
     * <br/>
     * <p>for value of default locale and default time pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default time pattern hh:mm:ss
     * @param date Date
     * @param locale Locale
     */
    public String getTimeAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(timePattern, locale).format(date);
    }

    /**
     * <p>Get month format with default default locale, the return value is string with default month pattern (MMMM)</p>
     * <br/><p>  
     * for value of default locale and default month pattern are configured in application.properties
     * </p>
     * @return String return value is string with default month pattern MMMM
     * @param date Date
     */
    public String getMonthAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(monthPattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Get month format with default specific locale, the return value is string with default month pattern (MMMM)</p>
     * <br/>
     * <p>for value of default locale and default month pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default month pattern MMMM
     * @param date Date
     * @param locale Locale
     */
    public String getMonthAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(monthPattern, locale).format(date);
    }

     /**
     * <p>Get year format with default locale, the return value is string with default year pattern (yyyy)</p>
     * <br/>
     * <p>for value of default locale and default year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default year pattern yyyy
     * @param date Date
     */
    public String getYearAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(yearPattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Get year format with specific locale, the return value is string with default year pattern (yyyy)</p>
     *  <br/>
     * <p>for value of default locale and default year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default year pattern yyyy
     * @param date Date
     * @param locale Locale
     */
    public String getYearAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(yearPattern, locale).format(date);
    }

    /**
     * <p>Get month and year format with default locale, the return value is string with default month and year pattern (MMMM-yyyy)</p>
     *<br/>  
     * <p>for value of default locale, default month and year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default month and year pattern MMMM-yyyy
     * @param date Date
     */
    public String getMonthAndYearAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(monthAndYearPatern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Get month and year format with specific locale, the return value is string with default month and year pattern (MMMM-yyyy)</p>
     * <br/> 
     * <p>for value of default locale, default month and year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default month and year pattern MMMM-yyyy
     * @param date Date
     * @param locale Locale
     */
    public String getMonthAndYearAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(monthAndYearPatern, locale).format(date);
    }

    /**
     * <p>Get Date format with default locale, the return value is Date with default date pattern (dd-MMMM-yyyy).</p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with pattern date dd-MMMM-yyyy
     * @param inputDate String
     */
    public Date getDateDefaultLocale(String inputDate) throws ParseException {
        return new SimpleDateFormat(datePattern, new Locale(defaultLocale)).parse(inputDate);
    }

    /**
     * <p>Get Date format with specific locale, the return value is Date with default date pattern (dd-MMMM-yyyy).</p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with pattern date dd-MMMM-yyyy
     * @param inputDate String
     * @param locale Locale
     */
    public Date getDateWithActiveLocale(String inputDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(datePattern, locale).parse(inputDate);
    }
    
    /**
     * <p>Get full Date format with default locale, the return value is Date with full date pattern (dd-MMMM-yy|hh:mm a).</p>
     * <br/>
     * <p>for value of default locale and format for full date pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with pattern date dd-MMMM-yy|hh:mm a
     * @param stringDate String
     */
    public Date getDateFullDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(dateFullPattern, new Locale(defaultLocale)).parse(stringDate);
    }
    
    /**
     * <p>Get full Date format with specific locale, the return value is Date with full date pattern (dd-MMMM-yy|hh:mm a).</p>
     * <br/>
     * <p>for value of default locale and format for full date pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with pattern date dd-MMMM-yy|hh:mm a
     * @param stringDate String
     * @param locale Locale
     */
    public Date getDateFullWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(dateFullPattern, locale).parse(stringDate);
    }

    /**
     * <p>Get Time with default locale, the return value is Date with default time pattern (hh:mm:ss).</p>
     * <br/>
     * <p>for value of default locale and format for Time pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Time pattern hh:mm:ss
     * @param stringDate String
     */
    public Date getTimeDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(timePattern, new Locale(defaultLocale)).parse(stringDate);
    }

    /**
     * <p>Get Time with specific locale, the return value is Date with default time pattern (hh:mm:ss).</p>
     * <br/>
     * <p>for value of default locale and format for Time pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Time pattern hh:mm:ss
     * @param stringDate String
     * @param locale Locale
     */
    public Date getTimeWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(timePattern, locale).parse(stringDate);
    }

    /**
     * <p>Get Month with default locale, the return value is Date with default month pattern (MMMM).</p>
     * <br/>
     * <p>for value of default locale and format for month pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Month pattern MMMM
     * @param stringDate String
     */
    public Date getMonthDefaultLocale(String StringDate) throws ParseException {
        return new SimpleDateFormat(monthPattern, new Locale(defaultLocale)).parse(StringDate);
    }

    /**
     * <p>Get Month with specific locale, the return value is Date with default month pattern (MMMM).</p>
     * <br/>
     * <p>for value of default locale and format for month pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Month pattern MMMM
     * @param stringDate String
     * @param locale Locale
     */
    public Date getMonthWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(monthPattern, locale).parse(stringDate);
    }

    /**
     * <p>Get Year with default locale, the return value is Date with default Year pattern (yyyy).</p>
     * <br/>
     * <p>for value of default locale and format for year pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Month pattern yyyy
     * @param stringDate String
     */
    public Date getYearDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(yearPattern, new Locale(defaultLocale)).parse(stringDate);
    }

     /**
     * <p>Get Year with specific locale, the return value is Date with default Year pattern (yyyy).</p>
     * <br/>
     * <p>for value of default locale and format for year pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Month pattern yyyy
     * @param stringDate String
     * @param locale Locale
     */
    public Date getYearWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(yearPattern, locale).parse(stringDate); 
    }

     /**
     * <p>Get Month and Year with default locale, the return value is Date with default Month & Year pattern (MMMM-yyyy).</p>
     * <br/>
     * <p>for value of default locale and format for year & year pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Month pattern MMMM-yyyy
     * @param stringDate String
     */
    public Date getMonthAndYearDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(monthAndYearPatern, new Locale(defaultLocale)).parse(stringDate);
    }

     /**
     * <p>Get Month and Year with specific locale, the return value is Date with default Month & Year pattern (MMMM-yyyy).</p>
     * <br/>
     * <p>for value of default locale and format for year & year pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with Month pattern MMMM-yyyy
     * @param stringDate String
     * @param locale Locale
     */
    public Date getMonthAndYearWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(monthAndYearPatern, locale).parse(stringDate);
    }
}
