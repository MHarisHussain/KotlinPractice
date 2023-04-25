fun main() {
    val isRaining = false

    if(isRaining){
        println("Take Umberalla")
    }else{
        println("No Rain Today - Enjoy your day")
    }

    if(isRaining) println("Will Rain") else println("Will Not Rain")

    val result = if(isRaining){
        "It Will Rain"
    }else {
        "Will Not Rain Today"
    }

    println(result)
}