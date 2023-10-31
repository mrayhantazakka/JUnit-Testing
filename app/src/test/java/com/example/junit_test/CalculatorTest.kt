package com.example.junit_test

import org.junit.Test
import kotlin.test.assertEquals

//membuat class untuk testing pada class calculator
class CalculatorTest {
//membuat variabel calculator berdasarkan class Calculator
    val calculator = Calculator()

    @Test //digunakan sebagai mendefinisikan bahwa ini class testing
    //function sebagai testing
    fun testAddSuccess(){
        // variabel result yang merupakan hasil penambahan angka first dan second
        val result = calculator.add(7, 8)
        //mengecek result(hasil) apakah berhasil, jika hasilnya 15 maka testnya berhasil
        assertEquals(15, result)
        //jika angka 15 diganti 14 harusnya eror, karena 7+8 harusnya hasilnya 15
    }
}