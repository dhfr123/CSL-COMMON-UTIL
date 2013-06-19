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
     * <p>Merubah date format menjadi string, berdasarkan default locale (in_ID - indonesia), format tanggal berdasarkan pattern dd-MMMM-yyyy.</p>
     * <br/><p>Get Date format with default locale (in_ID - indonesia), the return value is string with default date pattern dd-MMMM-yyyy.</p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with pattern date dd-MMMM-yyyy
     * @param date date
     */
    public String getDateAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(datePattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Merubah date format menjadi string, dengan locale tertentu, format tanggal berdasarkan pattern dd-MMMM-yyyy</p>
     * <br/><p>Get Date format with specific locale, the return value is string with default date pattern dd-MMMM-yyyy</p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with pattern date dd-MMMM-yyyy 
     * @param date date
     * @param locale locale 
     */
    public String getDateAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(datePattern, locale).format(date);
    }

    /**
     * <p>Merubah date format menjadi string, dengan default locale (in_ID - indonesia), format tanggal berdasarkan default full pattern dd-MMMM-yy|hh:mm a</p>
     * <br/><p>Get Date format with default locale (in_ID - indonesia), the return value is string with default full pattern dd-MMMM-yy|hh:mm a</p>
     * <br/> 
     * </p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default full date pattern dd-MMMM-yy|hh:mm a
     * @param date date
     */
    public String getDateFullAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(dateFullPattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Merubah date format menjadi string, dengan locale tertentu, format tanggal berdasarkan default full pattern dd-MMMM-yy|hh:mm a</p>
     * <br/><p>Get Date format with specific locale, the return value is string with default full date pattern dd-MMMM-yy|hh:mm a</p>
     * <br/> 
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default full date pattern dd-MMMM-yy|hh:mm a 
     * @param date date
     * @param locale locale 
     */
    public String getDateFullAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(dateFullPattern, locale).format(date);
    }

    /**
     * <p>Merubah date format menjadi time string, dengan default locale (in_ID - indonesia), format time berdasarkan default time pattern hh:mm:ss</p>
     * <br/><p>Get time format with default locale (in_ID - indonesia), the return value is string with default time pattern hh:mm:ss</p>
     * <br/>
     * <p>for value of default locale and default time pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default time pattern hh:mm:ss
     * @param date date
     */
    public String getTimeAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(timePattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Merubah date format menjadi time string, dengan locale tertentu, format time berdasarkan default time pattern hh:mm:ss</p>
     * <br><p>Get time format with default specific locale, the return value is string with default time pattern hh:mm:ss</p>
     * <br/>
     * <p>for value of default locale and default time pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default time pattern hh:mm:ss
     * @param date date
     * @param locale locale
     */
    public String getTimeAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(timePattern, locale).format(date);
    }

    /**
     * <p>Merubah date format menjadi month string, dengan default locale (in_ID - indonesia), format month berdasarkan default month pattern MMMM</p>
     * <br/><p>Get month format with default default locale (in_ID - indonesia), the return value is string with default month pattern MMMM</p>
     *<br/><p>  
     * for value of default locale and default month pattern are configured in application.properties
     * </p>
     * @return String return value is string with default month pattern MMMM
     * @param date date
     */
    public String getMonthAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(monthPattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Merubah date format menjadi month string, dengan locale tertentu, format month berdasarkan default month pattern MMMM</p>
     * <br/><p>Get month format with default specific locale, the return value is string with default month pattern MMMM</p>
     * <br/>
     * <p>for value of default locale and default month pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default month pattern MMMM
     * @param date date
     * @param locale locale
     */
    public String getMonthAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(monthPattern, locale).format(date);
    }

     /**
     * <p>Merubah date format menjadi year string, dengan default locale (in_ID - indonesia), format year berdasarkan default year pattern yyyy</p>
     * <br/><p>Get year format with default locale (in_ID - indonesia), the return value is string with default year pattern yyyy</p>
     *  <br/>
     * <p>for value of default locale and default year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default year pattern yyyy
     * @param date date
     */
    public String getYearAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(yearPattern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Merubah date format menjadi year string, dengan locale tertentu, format year berdasarkan default year pattern yyyy</p>
     * <br/><p>Get year format with specific locale, the return value is string with default year pattern yyyy</p>
     *  <br/>
     * <p>for value of default locale and default year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default year pattern yyyy
     * @param date date
     * @param locale locale
     */
    public String getYearAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(yearPattern, locale).format(date);
    }

    /**
     * <p>Merubah date format menjadi month dan year (string), dengan default locale (in_ID - indonesia), format berdasarkan default month and year pattern MMMM-yyyy</p>
     * <br/><p>Get month and year format with default locale (in_ID - indonesia), the return value is string with default month and year pattern MMMM-yyyy</p>
     *<br/>  
     * <p>for value of default locale, default month and year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default month and year pattern MMMM-yyyy
     * @param date date
     */
    public String getMonthAndYearAsStringsDefaultLocale(Date date) {
        return new SimpleDateFormat(monthAndYearPatern, new Locale(defaultLocale)).format(date);
    }

    /**
     * <p>Merubah date format menjadi month dan year (string), dengan locale tertentu, format berdasarkan default month and year pattern MMMM-yyyy</p>
     * <br/><p>Get month and year format with specific locale, the return value is string with default month and year pattern MMMM-yyyy</p>
     * <br/> 
     * <p>for value of default locale, default month and year pattern are configured in application.properties</p>
     * 
     * @return String return value is string with default month and year pattern MMMM-yyyy
     * @param date date
     * @param locale locale
     */
    public String getMonthAndYearAsStringsWithActiveLocale(Date date, Locale locale) {
        return new SimpleDateFormat(monthAndYearPatern, locale).format(date);
    }

    /**
     * <p>Merubah String format menjadi date, berdasarkan default locale (in_ID - indonesia), format tanggal berdasarkan pattern dd-MMMM-yyyy.</p>
     * <br/><p>Get String format with default locale (in_ID - indonesia), the return value is string with default date pattern dd-MMMM-yyyy.</p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with pattern date dd-MMMM-yyyy
     * @param date date
     */
    public Date getDateDefaultLocale(String inputDate) throws ParseException {
        return new SimpleDateFormat(datePattern, new Locale(defaultLocale)).parse(inputDate);
    }

    /**
     * <p>Merubah String format menjadi date, berdasarkan locale tertentu, format tanggal berdasarkan pattern dd-MMMM-yyyy.</p>
     * <br/><p>Get String format with specific locale, the return value is string with default date pattern dd-MMMM-yyyy.</p>
     * <br/>
     * <p>for value of default locale and date format pattern are configured in application.properties</p>
     * 
     * @return Date return value is Date with pattern date dd-MMMM-yyyy
     * @param date date
     * @param locale locale
     */
    public Date getDateWithActiveLocale(String inputDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(datePattern, locale).parse(inputDate);
    }
    
    public Date getDateFullDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(dateFullPattern, new Locale(defaultLocale)).parse(stringDate);
    }
    
    public Date getDateFullWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(dateFullPattern, locale).parse(stringDate);
    }

    public Date getTimeDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(timePattern, new Locale(defaultLocale)).parse(stringDate);
    }

    public Date getTimeWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(timePattern, locale).parse(stringDate);
    }

    public Date getMonthDefaultLocale(String StringDate) throws ParseException {
        return new SimpleDateFormat(monthPattern, new Locale(defaultLocale)).parse(StringDate);
    }

    public Date getMonthWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(monthPattern, locale).parse(stringDate);
    }

    public Date getYearDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(yearPattern, new Locale(defaultLocale)).parse(stringDate);
    }

    public Date getYearWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(yearPattern, locale).parse(stringDate); 
    }

    public Date getMonthAndYearDefaultLocale(String stringDate) throws ParseException {
        return new SimpleDateFormat(monthAndYearPatern, new Locale(defaultLocale)).parse(stringDate);
    }

    public Date getMonthAndYearWithActiveLocale(String stringDate, Locale locale) throws ParseException {
        return new SimpleDateFormat(monthAndYearPatern, locale).parse(stringDate);
    }
}
