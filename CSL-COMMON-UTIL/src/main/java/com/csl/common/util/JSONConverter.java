/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * JSON Conveter Class Utility untuk mengenerate JSON dari Java Object dan mendapatkan Java Object dari JSON.
 * <p>JSONConverter Class yang di manage oleh Spring.
 * @author Deni Husni Fahri Rizal
 * @author Zulfi Adi Harianto 
 * @param jsonPatternDateFormat merupakan pattern dari Date yang akan di pakai oleh Engine GSON.
 * @param jsonMsg string dengan forman json
 * @param keyName paremeter berupa nama variable pada Class yang akan diambil 
 * 
 */
public class JSONConverter {

    private String jsonPatternDateFormat;

    public void setJsonPatternDateFormat(String jsonPatternDateFormat) {
        this.jsonPatternDateFormat = jsonPatternDateFormat;
    }

    public String toJSON(Object object) {
        Gson gson = new GsonBuilder().setDateFormat(jsonPatternDateFormat).create();
        return gson.toJson(object).toString();
    }

    public String getValueByKey(String jsonMsg, String keyName) {
        JsonElement jelement = new JsonParser().parse(jsonMsg);
        JsonObject jobject = jelement.getAsJsonObject();
        return jobject.get(keyName).getAsString();
    }

    public Object getClassFromJSON(String jsonMsg, Class clazz) {
        Gson gson = new GsonBuilder().setDateFormat(jsonPatternDateFormat).create();
        return gson.fromJson(jsonMsg, clazz);
    }
}
