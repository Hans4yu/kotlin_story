package com.dicoding.aplikasipertama

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println(2)
    //nullable tutorials
    var userid: Int? = null
    //userid = 02
    println("User Id is = $userid")

    val text:String? =null
    println("hello $text")
    println(text?.length)
    val nama: String = "Arif"

    val umur: Int = 17
    println("Hello $nama")
    println("Umur Saya : $umur")

    //collection
    val integerList = listOf(1,2,3,4,4,5)//boleh sama
    println("hello $integerList")

    val integerSet = setOf(1,2,3,4,4,5)// tidak boleh sama
    println("hello $integerSet")

    //menyimpan key to value key unik tidak boleh sama
    val jobs = mapOf(
        "Teacher" to "Master School",
        "Sarjana" to "Master",
        "New Delhi" to "India"
    )
    println("$jobs")
    jobs.getValue("Teacher")
    jobs["New Delhi"]

    //mutablellist vs list bisa diubah nilainya
    class User
    val anyList = mutableListOf('a', "Kotlin", 3, true, User())
    anyList.add('d')
    anyList.add(1,"love")
    anyList[3] = false
    anyList.removeAt(1)
    println(anyList)

    // menggabungkan 2 val
    val firstWord = "Z "
    val lastWord = "Academy"
    println(firstWord + lastWord)

    val valueA: Int = 66
    val valueB: Int = 600
    println(valueA+valueB)
    println(valueA%valueB)
    println(valueA/valueB)
    println(valueA*valueB)
    println(valueA-valueB)

    var valueK = 2
    valueK = valueK + 2

    var anotherValueK = 1
    anotherValueK += 2

    println(valueK)
    println(anotherValueK)

    var nilai = 10
    nilai += 5
    println(nilai)

    var nilaiA = 10
    nilaiA -= 5
    println(nilaiA)

    var nilaiB = 10
    nilaiB /= 5
    println(nilaiB)

    var nilaiC = 10
    nilaiC *= 5
    println(nilaiC)

    var nilaiD = 10
    nilaiD %= 5
    println(nilaiD)

    var x = false
    var y = false
    println("x  && y: ${x && y}")
    println("x || y: ${x || y}")
    println("!x: ${!x}")

    var c = 6
    c++
    println("Nilai B setelh increment: $c")
    c--
    println("Nilai c setelah increment: $c")

    var character = 'V'
    //var character = 'BC' error hanya tunggal

    var vocal = 'A'
    println("vocal : " + vocal++)
    println("vocal : " + vocal++)
    println("vocal : " + vocal++)
    println("vocal : " + vocal++)

    val text1 = "Dicoding"
    val firstChar = text1[2]
    println("the 2nd character of the text is $firstChar")

    val text2 = "082132102060"
    for (char in text2) {
        print("$char ")
    }

    val statement = "Kotlin is \"Great\" "
        println(statement)

    val line = "line \n"+
            "line 2\n"+
            "line 3\n"+
            "line 4\n"
    println(line)

    //raw string
    val line2 = """
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
    """    .trimIndent()
    println(line2)

    //string templater
    var old = 18.0
        var name1 = "Farhan"
            var userid1 = 820123000

    println("Hello my age is $old years")
    println("Nice to meet you, btw my name is $name1 within card id : $userid1")

    var hour = 12
    println("Office ${if(hour >=12) "break time" else "work"}")

    var openHours = 8.00
    var now = 8.30
    var mall: String
    if (now>openHours){
        mall = "Mall is alr open"
    }
        else{
            mall = "Mall is closed"
        }
    println(mall)
}


