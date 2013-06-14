/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Deni Husni Fahri Rizal
 */
public class CommonUtilService {

    private static ApplicationContext appContext;

    public static ApplicationContext getApplicationContext() {
        if (appContext == null) {
            appContext = new ClassPathXmlApplicationContext("spring/commonAppContext.xml");
        }
        return appContext;
    }

    public static Object getService(String beansName) {
        return getApplicationContext().getAutowireCapableBeanFactory().getBean(beansName);

    }
}
