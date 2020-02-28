package com.tata.javatests;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        assertEquals("holaholahola", result);

        String result2 = StringUtil.repeat("hola", 1);
        assertEquals("hola", result2);
    }

    private static void assertEquals(String expected, String reality) {
        if (!reality.equals(expected)) {
            throw new RuntimeException("ERROR");
        }
    }


}