/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csl.common.util;

import java.math.BigInteger;
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
}
