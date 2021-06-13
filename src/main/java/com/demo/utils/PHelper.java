package com.demo.utils;

public class PHelper {

    public static long getDeltaTime(long startTime) {
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
