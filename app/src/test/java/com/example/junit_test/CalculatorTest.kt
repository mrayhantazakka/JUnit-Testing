package com.example.junit_test

import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun testAddSuccess(){
        val result = calculator.add(7, 8)
        assertEquals(15, result)
    }
}