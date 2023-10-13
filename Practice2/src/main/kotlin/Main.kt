fun main(args: Array<String>) {
    //Zd 1
    val age1 = 42
    val age2 = 21

    //Zd 2
    val avg1 = (age1 + age2) / 2
    println("Среднее арифметичекое: $avg1")

    //Zd 4
    val firstName = "Кемран"
    val lastName =" Гошоков"

    //Zd 5
    val fullName: String
    fullName = "$firstName" + "$lastName"
    println(fullName)

    //Zd 6
    val myDetails: String
    myDetails = "Привет, меня зовут " + "$fullName"
    println(myDetails)

    //Zd 7
    val Triple = Triple(9,16,2004)
    val x1 = Triple.first
    val x2 = Triple.second
    val x3 = Triple.third
    println("Дата рождения: ${Triple.first} , ${Triple.second} , ${Triple.third}")

    //Zd 8
    val (month, day, year) = Triple
    println("month: $month")
    println("day: $day")
    println("year: $year")

    }
