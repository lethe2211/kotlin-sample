package com.lethe2211.kotlinsample.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class POJOTest {

    @Test
    public void POJOTest() {
        POJO pojo = new POJO();
        assertEquals("POJO{num=-1, str=''}", pojo.toString());

        assertEquals(Integer.valueOf(-1), pojo.getNum());

        POJO pojo2 = new POJO(-1, "");
        assertTrue(pojo.equals(pojo2));
    }

}
