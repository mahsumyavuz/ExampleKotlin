package org.example

import java.text.DecimalFormat

fun main(){
    val name="Mahsum"
    val surName="YAVUZ"
    val age=25
    val height=3.1548

    val message= String.format("Adı: %s, Soyad: %s, Yaş: %d, Boy: %.3f Metre", name, surName, age, height)
    println(message)

    val rawString="""
       $     *
            ***
           *****
          *******
    """.trimMargin("$")
    println(rawString)

    println("---------------")
    val product="LAptop"
    val price=5999.99
    println("Ürün: $product, Fiyat: $price TL")
    println("KDV'li fiyat: ${price*1.18} TL")
    println("Formatlı: ${"%.2f".format(price)} TL")

    val pi = 3.1415926535
    println("Pi: %.3f".format(pi)) // Pi: 3.142
    println("---------------")

    val df = DecimalFormat("#,###.00")
    val number = 1234567.8912
    println(df.format(number))

}