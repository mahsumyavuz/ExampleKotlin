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
    println("-------------------------------------------------------")

    val twoDArray=Array(2){Array<Int>(2){0} }
    println("twoDArray" +twoDArray.contentDeepToString())
    twoDArray[1][0]=20
    println("twoDArray" +twoDArray.contentDeepToString())

    val threeDArray=Array(3){Array(3){Array<Int>(3){0} } }
    println("threeDArray" +threeDArray.contentDeepToString())
    println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ")
    val name1="MAhsum"
    val surName1="Yavuz"
    val age1=34
    val indexName= arrayOf(name1,surName1,age1,name1,surName1,age1)
    for (index in indexName.indices) {
        println(indexName[index].toString())

    }
    println(indexName.contentDeepToString())
    println("*************************************")

    // Creates an array with values [null, null, null]
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
    // null, null, null

}
