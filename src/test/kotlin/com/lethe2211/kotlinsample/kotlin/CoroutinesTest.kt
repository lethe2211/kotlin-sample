package com.lethe2211.kotlinsample.kotlin

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.concurrent.atomic.AtomicLong

internal class CoroutinesTest {

    @Test
    fun `Basic sample`() {
        println("Start")

        // Start a coroutine
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }

        runBlocking {
            delay(2000)
            println("blocked")
        }

        Thread.sleep(2000) // wait for 2 seconds
        println("Stop")
    }

    @Test
    fun `Add to AtomicLong`() {
        val c = AtomicLong()

        for (i in 1..1_000_000L)
            GlobalScope.launch {
                c.addAndGet(i)
            }

        println(c.get())
    }

    @Test
    fun `Async & Await`() {
        val deferred = (1..1_000_000).map { n ->
            GlobalScope.async {
                delay(1000)
                n
            }
        }

        runBlocking {
            val sum = deferred.sumBy { it.await() }
            println("Sum: $sum")
        }
    }
}