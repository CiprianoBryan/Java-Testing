package com.tata.javatests;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        assertEquals("holaholahola", result);

        String result2 = StringUtil.repeat("hola", 1);
        assertEquals("hola", result2);
    }
}