import basics.*
//also we can use each function only calling our package and function

//args are the arguments that receive from OS
fun main(args: Array<String>) {

    //Calling function from package
    println(basics.add(2,2))

    //Calling all functions
    println(add(2,3))
    println(substraction(5,3))
    println(division(3,6))
    println(multiplication(7,7))

    // Try adding program arguments via Run/Debug configuration.
    println("Program arguments: ${args.joinToString()}")


}