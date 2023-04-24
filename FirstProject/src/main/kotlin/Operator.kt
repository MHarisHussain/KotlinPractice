fun main(){

    var i : Int = 13
    var j : Int = 2


    //Arithmetic Operators
    /*
    * Addition +
    * Subtraction -
    * Multiplication *
    * Division /
    * Remainder or Modules %
    * */

    println("Addition : ${i+j}")
    println("Subtraction : ${i-j}")
    println("Multiplication : ${i*j}")
    println("Division : ${i.toFloat()/j}")
    println("Remainder : ${i%j}")

    //Relational Operators
    /**
     * Greater Than (>)
     * Less Than (<)
     * Greater Than Equal To (>=)
     * Less Than Equal To (<=)
     * Equals (==)
     * Not Equals (!-=)
     */

    println("13 is Greater Than 2 = ${i>j}")
    println("13 is Less Than 2 = ${i<j}")
    println("13 is Greater Than Or Equal To 2 = ${i>=j}")
    println("13 is Less Than Or Equal To 2 = ${i<=j}")
    println("13 is Equal To 2 = ${i==j}")
    println("13 is Not Equal To 2 = ${i!=j}")


    //Pre / Post Increment

    var pre_variable : Int = 10

    println(pre_variable++)
    println(pre_variable)

    var post_variable : Int = 10
    println(++post_variable)
    println(post_variable)

    //Pre / Post Decrement

    var pre_dec : Int = 10

    println(pre_dec--)
    println(pre_dec)

    var post_dec : Int = 10

    println(--post_dec)
    println(post_dec)

}