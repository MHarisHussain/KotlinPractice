fun main() {
    /**
     * Agenda
     * Logical Operators
     * Short Circuiting
    */

    /*
    * Logical Operators
    * (&&) AND
    * (||) OR
    * (!) NOT
    * */

    val above70 = false
    val knowsProgramming = true

    //&& AND
    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

    /**
     * Short Circuiting
     */

    var i = 10
    var j = 11

    /**
     * What is Short Circuiting?
     * In programming when we are writing the code like in the example below
     * the OR operator will see the first statement is true and will not
     * execute the other statement
     * Like i == 10 (True) it will end the execution and will not execute
     * the code after it
     */

    var result = i == 10 || j++ == 11
    println(i)
    println(j)

    //Not Operator
    // false --> ! --> true
    // true --> ! --> false

    val answer = false
    val operatorAnswer = !answer
    println(operatorAnswer)
}