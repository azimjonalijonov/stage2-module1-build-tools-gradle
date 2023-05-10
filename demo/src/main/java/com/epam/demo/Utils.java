package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        if (args.isEmpty()) {
            return false;
        }
        for (String string :
                args) {
            if (!StringUtils.isPositiveNumber(string)) {
                return false;
            }
        }
        return true;
    }
}
