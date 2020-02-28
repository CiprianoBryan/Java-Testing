package com.tata.javatests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        String result = StringUtil.repeat("hola", 1);
        assertEquals("hola", result);
    }

    @Test
    public void repeat_string_multiple_times() {
        String result = StringUtil.repeat("hola", 3);
        assertEquals("holaholahola", result);
    }

    @Test
    public void repeat_string_zero_times() {
        String result = StringUtil.repeat("hola", 0);
        assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }
}