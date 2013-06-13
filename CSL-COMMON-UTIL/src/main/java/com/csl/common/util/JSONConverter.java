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
 *
 * @author Deni Husni Fahri Rizal
 * @author Zulfi
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
