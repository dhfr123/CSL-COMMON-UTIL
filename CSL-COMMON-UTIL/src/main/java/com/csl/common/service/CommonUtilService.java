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

    /**
     *
     * @author Deni Husni Fahri Rizal
     * @param spring/commonAppContext.xml
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        if (appContext == null) {
            appContext = new ClassPathXmlApplicationContext("spring/commonAppContext.xml");
        }
        return appContext;
    }

    /**
     *  This Method for get Object Class that managed by Spirng.
     * <p> This method support for @anotation (Autowire) and non @anotation
     * @author Deni Husni Fahri Rizal
     * @param beansName String interfaced name
     * @return Object instance of service
     */
    public static Object getService(String beansName) {
        return getApplicationContext().getAutowireCapableBeanFactory().getBean(beansName);

    }
}
