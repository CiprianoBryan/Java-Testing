package com.tata.javatests;

public class StringUtil {
    public String repeat(String text, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += text;
        }
        return result;
    }
}
