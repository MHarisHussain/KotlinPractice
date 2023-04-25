fun main() {

    val animal = "Dog"

    /*if(animal == "Horse"){
        println("The animal is Horse")
    }else if(animal == "Cat"){
        println("The animal is Car")
    }else if(animal == "Dog"){
        println("The animal is Dog")
    }else{
        println("Animal not found")
    }*/

    /*when(animal){
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("Animal not found")
    }*/

    val result = when(animal){
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "Animal not found"
    }
    println(result)

    val number = 13
    val output = when(number){
        10 -> "Ten"
        11 -> "Twelve"
        in 12..13 -> "Between 12 and 13"
        else -> "Not a number"
    }
    println(output)
}