package com.lethe2211.kotlinsample.kotlin

data class POJO(
    val num: Int = -1,
    val str: String = ""
) {
    inner class Inner {

    }
}

data class POJO1(
    val num: Int
)