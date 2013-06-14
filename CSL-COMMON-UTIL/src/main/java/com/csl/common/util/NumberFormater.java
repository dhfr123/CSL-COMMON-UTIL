/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * NumberFormater untuk memformat dan mempasring dari String dan number class
 * ini dimange oleh spring.
 *
 * @author Deni Husni Fahri Rizal
 *
 * @param minFractionDigit jumlah minimum digit
 * @param maxFractionDigit jumlah maximum digit
 * @param defaultLocale locale default dari aplikasi
 * @param activeLocale locale yang active atau dipake di apliaksi bisa di ambil
 * dari session apliaksi atau local sessison apliaksi
 */
public class NumberFormater {

    private Integer minFractionDigit;
    private Integer maxFractionDigit;
    private String defaultLocale;

    public Integer getMinFractionDigit() {
        return minFractionDigit;
    }

    public void setMinFractionDigit(Integer minFractionDigit) {
        this.minFractionDigit = minFractionDigit;
    }

    public Integer getMaxFractionDigit() {
        return maxFractionDigit;
    }

    public void setMaxFractionDigit(Integer maxFractionDigit) {
        this.maxFractionDigit = maxFractionDigit;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public String getNumberAsStringDefaultLocale(Number number, String typeIntance) {
        NumberFormat nf = getNumberFormat(typeIntance, new Locale(defaultLocale));
        nf.setMaximumFractionDigits(maxFractionDigit);
        nf.setMinimumFractionDigits(minFractionDigit);
        return nf.format(number);
    }

    public String getNumberAsStringActiveLocale(Number number, Locale locale, String typeIntance) {
        NumberFormat nf = getNumberFormat(typeIntance, locale);
        nf.setMaximumFractionDigits(maxFractionDigit);
        nf.setMinimumFractionDigits(minFractionDigit);
        return nf.format(number);
    }

    public Number getNumberDefaultLocale(String inputNumber, String typeIntance) throws ParseException {
        NumberFormat nf = getNumberFormat(typeIntance, new Locale(defaultLocale));
        nf.setMaximumFractionDigits(maxFractionDigit);
        nf.setMinimumFractionDigits(minFractionDigit);
        return nf.parse(inputNumber);
    }

    public Number getNumberActiveLocale(String inputNumber, Locale locale, String typeIntance) throws ParseException {
        NumberFormat nf = getNumberFormat(typeIntance, locale);
        nf.setMaximumFractionDigits(maxFractionDigit);
        nf.setMinimumFractionDigits(minFractionDigit);
        return nf.parse(inputNumber);
    }

    private NumberFormat getNumberFormat(String typeIntance, Locale locale) {
        NumberFormat nf = null;
        if (typeIntance.equalsIgnoreCase(CommonUtilConstant.NUMBER_FORMAT_TYPE_NUMBER)) {
            nf = NumberFormat.getNumberInstance(locale);
        }
        if (typeIntance.equalsIgnoreCase(CommonUtilConstant.NUMBER_FORMAT_TYPE_PERCENT)) {
            nf = NumberFormat.getPercentInstance(locale);
        }
        if (typeIntance.equalsIgnoreCase(CommonUtilConstant.NUMBER_FORMAT_TYPE_CURRENCY)) {
            nf = NumberFormat.getCurrencyInstance(locale);
        }
        return nf;
    }
}
