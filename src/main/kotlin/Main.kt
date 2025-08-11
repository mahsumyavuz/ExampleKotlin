package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Muhammed Çağan"
    val surname: String
    val age = 34
    surname="YAVUZ"
    println(age)
    println(name+surname)
    val isMale=true
    println("Test")
    println(isMale)
    println("TEST 2")


    println("---------------------------------------\n" )
    val numberValue: String ="value 254 = "+(215+54+65)
    println("number value $numberValue")
    println("numberValue \$ $numberValue")
    println("numberValue  ${numberValue.length}")

    println("----------------------------------------")

    val marginText = """
    >Bu bir
    >örnek
    >metin.
    """.trimMargin(">")
    println(marginText)

    val regex = """\d{2}-\d{2}-\d{4}""".toRegex() // Tarih formatı (örn: 31-12-2023)
    println(regex.matches("31-12-20235")) // true

}
