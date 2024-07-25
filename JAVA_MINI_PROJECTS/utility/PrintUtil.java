package com.seed.library.utility;

import java.util.List;

public class PrintUtil {
    public static void printRecords(List<?> records) {
        for (Object record : records) {
            System.out.println(record);
        }
    }
}