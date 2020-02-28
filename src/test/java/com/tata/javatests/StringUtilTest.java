package com.tata.javatests;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        if (!result.equals("holaholahola")) {
            throw new RuntimeException("ERROR");
        }

        String result2 = StringUtil.repeat("hola", 1);
        if (!result2.equals("hola")) {
            throw new RuntimeException("ERROR");
        }
    }
}