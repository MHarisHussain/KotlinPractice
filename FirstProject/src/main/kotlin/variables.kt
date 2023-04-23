fun main() {
    var score = 5 // Type Inference mean kotlin will detect the data type itself
    score = 10
    //score = 10.5 // Type Checking mean kotlin will generate the error in compile time

    val message = "A val can't be re-assigned"
    //message = "Change the val"

    println(message)
    print(score)

    //Explicitly assigning datatype

    var grade : Int = 10
    var temp : Double = 15.5
    var aplhabet : Char = 'A'
    var isRaining : Boolean = false
    var sentence : String = "This is a sentence"

}