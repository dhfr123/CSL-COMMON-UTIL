/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.service;

import com.csl.common.util.DateFormatter;

/**
 *
 * @author CSL
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateFormatter dateFormater=  (DateFormatter)CommonUtilService.getService("dateFormater");
        System.out.println(dateFormater.getDayPattern());
    }
}
