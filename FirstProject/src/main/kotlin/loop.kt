fun main() {

    val table : Int = 2
    var count : Int = 1

    println("While Loop\n")

    while(count <= 10){
        println("$table x $count = ${table*count} ")
        count++
    }

    var number = 1
    println("Do While Loop\n")
    do{
        println("$table x $number = ${table*number}")
        number++
    }while (number <= 10)
}