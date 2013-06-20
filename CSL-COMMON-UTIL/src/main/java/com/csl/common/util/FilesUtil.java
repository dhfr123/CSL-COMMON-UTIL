/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Deni Husni Fahri Rizal
 */
public class FilesUtil {
    
    public static String getHumanReadableSize(BigInteger byteSize) {
        return FileUtils.byteCountToDisplaySize(byteSize);
    }
    
    public static String getHumanReadableSize(Long byteSize) {
        return FileUtils.byteCountToDisplaySize(byteSize);
    }
    
    public static List<String> getListStringFromFile(File file) throws IOException {
        return FileUtils.readLines(file);
    }
    
    public static String getStringFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file);
    }
    
    public static byte[] getByteFromFile(File file) throws IOException {
        return FileUtils.readFileToByteArray(file);
    }
    
    public static void writeToFileFromString(File file, String data) throws IOException {
        FileUtils.writeStringToFile(file, data);
    }
    
    public static void writeToFileFromCollection(File file, Collection<?> data) throws IOException {
        FileUtils.writeLines(file, data);
    }
    
    public static Long getFileSize(File file) {
        return FileUtils.sizeOf(file);
    }
    
    public static Long getDirectorySize(File directory) {
        return FileUtils.sizeOfDirectory(directory);
    }
    
    public static void copyFileToFile(File source, File destination) throws IOException {
        FileUtils.copyFile(source, destination);
    }
    
    public static void copyFileToDirectory(File sourceFile, File dirDestination) throws IOException {
        FileUtils.copyFileToDirectory(sourceFile, dirDestination);
    }
    
    public static void deleteFile(File file) throws IOException {
//        Jika berupa folder maka semua file dalam folder akan terhpus dan turunananya
        FileUtils.forceDelete(file);
      
    }
    
    public static void moveFile(File source, File destiantion) throws IOException{
        FileUtils.moveFile(source, destiantion);
    }
    
 
}
