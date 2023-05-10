package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //here magic will happen
        if (!NumberUtils.isNumber(str)) {
            return false;
        }
        return Double.parseDouble(str) > 0;
    }

    public static void main(String[] args) {
        System.out.println("-55.1");
    }
}
