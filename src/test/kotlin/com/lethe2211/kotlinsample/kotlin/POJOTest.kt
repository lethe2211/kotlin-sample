package com.lethe2211.kotlinsample.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class POJOTest {

    @Test
    fun `Data class`() {
        val pojo = POJO()
        assertEquals("POJO(num=-1, str=)", pojo.toString())

        assertEquals(-1, pojo.num)

        val pojo2 = POJO(-1, "")
        assertTrue(pojo == pojo2)
    }
}