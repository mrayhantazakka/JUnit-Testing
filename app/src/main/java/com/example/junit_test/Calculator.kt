package com.example.junit_test

//membuat class Calculator yang akan diuji
class Calculator {
    // membuat function didalam class calculator dengan parameter first sebagai angkla pertama,
    // dan second sebagai angka kedua(angka yang akan ditambahkan) sesuai operator yang diinginkan
    fun add(first: Int, second: Int): Int{
        // function add berisi mengembalikan nilai first dan second setelah ditambahkan
        return second + first
    }
}