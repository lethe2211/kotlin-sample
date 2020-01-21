package com.lethe2211.kotlinsample.kotlin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NullSafetyTest {

    @Test
    fun `Null Safety`() {
        val nullSafety = NullSafety()
        val str = nullSafety.retString() // Nullable (String?)

//         val length = str.length // Compilation error
        assertEquals(null, str?.length)

        val str2: String = "abc" // OK
        // val str3: String = null // Compilation error

        val str4: String? = null // OK
        val str5: MutableList<String> = mutableListOf();
        str5.add("hoge");
    }

    @Test
    fun `Smart Cast`() {
        val nullSafety = NullSafety()
        val str = nullSafety.retString()

        if (str != null) { // In this block, str will be regarded as NonNull
            val length = str.length // It's OK
        }

        if (str is String) {
            val length = str.length // It's also OK
        }

        val strNonNull = str ?: "" // strNonNull will be "" if str is null (Elvis operator)
        val length = strNonNull.length // It's OK because strNonNull is now String
    }
}

