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
    
    /**
     * Returns a human-readable version of the file size, where the input represents a specific number of BigInteger. 
     * @return String
     * @param byteSize BigInteger
     */
    public static String getHumanReadableSize(BigInteger byteSize) {
        return FileUtils.byteCountToDisplaySize(byteSize);
    }
    
     /**
     * Returns a human-readable version of the file size, where the input represents a specific number of Long. 
     * @return String
     * @param byteSize Long
     */
    public static String getHumanReadableSize(Long byteSize) {
        return FileUtils.byteCountToDisplaySize(byteSize);
    }
    
    /**
     * Reads the contents of a file line by line to a List of Strings.
     * @return List<String> List of String
     * @param file File 
     */
    public static List<String> getListStringFromFile(File file) throws IOException {
        return FileUtils.readLines(file);
    }
    
    /**
     * Reads the contents of a file into a String.
     * @return String contents of file
     * @param File file to reads
     * 
     */
    public static String getStringFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file);
    }
    
    /**
     * Reads the contents of a file into a byte array
     * @return byte[] contents of file in byte array
     * @param File file to reads
     * 
     */
    public static byte[] getByteFromFile(File file) throws IOException {
        return FileUtils.readFileToByteArray(file);
    }
    
    
    /**
     * Writes a String to a file creating the file if it does not exist
     * @return void File
     * @param File file to reads
     * @param data string that want to write to the file
     * 
     */
    public static void writeToFileFromString(File file, String data) throws IOException {
        FileUtils.writeStringToFile(file, data);
    }
    
    /**
     * Writes the toString() value of each item in a collection to the specified File line by line
     * @return void file
     * @param data the lines to write, null entries produce blank lines
     */
    public static void writeToFileFromCollection(File file, Collection<?> data) throws IOException {
        FileUtils.writeLines(file, data);
    }
    
    /**
     * Returns the size of the specified file or directory. 
     * @return Long size of file or directory
     * @param file the regular file or directory to return the size of
     */
    public static Long getFileSize(File file) {
        return FileUtils.sizeOf(file);
    }
    
    /**
     * Counts the size of a directory recursively (sum of the length of all files)
     * @return  Long size of directory
     * @param File directory to inspect
     */
    public static Long getDirectorySize(File directory) {
        return FileUtils.sizeOfDirectory(directory);
    }
    
    /**
     * Copies a file to a new location. 
     * @return void copied file
     * @param source source path
     * @param destination destination path to copy
     */
    public static void copyFileToFile(File source, File destination) throws IOException {
        FileUtils.copyFile(source, destination);
    }
    
    /**
     * Copies a file to a directory optionally preserving the file date. 
     * @return void copied file
     * @param source source path
     * @param dirDestination destination path to be copied
     */
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
