/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import java.util.Random;

/**
 *
 * @author AdityaSatrioNugroho
 */
public class RandomUtils {
    
    private static Object getRandomInteger(){
        return Math.abs(new Random().nextInt());
    }
    
    private static Object getRandomLong(){
        return  Math.abs(new Random().nextLong());
    }
    
    private static Object getRandomLong(Integer in){
        String string = "";
        for(int i = 0; i <= in; i++ ){
            string += getRandomLong().toString();
        }
        
        return  string;
    }
    
    /**
     * Generate random number 
     * @return Object if the length between 1 - 19 it will return Long type, but if the length between 20 - 99 it will return string.
     * @param length the length of random number, maximum length is 100
     */
    public static Object getRandomNumber(Integer length) throws Exception{
        if(length.compareTo(0) == 0){
            throw new Exception("length cant be zero");
        
        }else if(length.compareTo(10) < 0){
            String number = getRandomInteger().toString().substring(0, length);
            return Long.parseLong(number);
        
        }else if(length.compareTo(20) < 0 && length.compareTo(9) > 0){
            String number = getRandomLong().toString().substring(0, length);
            return Long.parseLong(number);
            
        }else if(length.compareTo(76) < 0 && length.compareTo(19) > 0){
            String number = getRandomLong(3).toString().substring(0, length);
            return number;
            
        }else if(length.compareTo(100) < 0 && length.compareTo(75) > 0){
            String number = getRandomLong(5).toString().substring(0, length);
            return number;
            
        }else {
            throw new Exception("Maximum length is 100");
        }
        
    }
    
}
