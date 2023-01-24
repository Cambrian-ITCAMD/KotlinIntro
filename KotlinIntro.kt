/*
    Don't forget to add more comments
 */
fun main(){
    print("Hello World!\n")

    // this is a comment
    /* this is also a comment */

    /*
        variables
        print/read
        conditionals (if)
        loops
        arrays
        function
        classes/objects
     */

    // int myInt = 5;
    // Kotlin has datatype, but defines variables with var and val
    // var is mutable (can be changed)
    var myInt = 5
    // val is immutable (cannot be changed)
    val myChar = 's'
    // this won't work
    //myChar = 'a'
    var myDouble : Double = 3.14

    // printLn, not print1n or printIn
    // print LINE with lowercase L
    println(myInt)
    println(myDouble)
    println(myChar)

    //myChar = readln()
    // this won't work because Kotlin needs to know the data type
    //var myNewInt
    var myNewInt : Int
    myNewInt = readln().toInt()
    println("My int is: " + myNewInt)
    println("My int is $myNewInt")

    // if statements are if statements
    // same as always
    var myBool = true
    if(myBool){
        println("Must be heads")
    } else if(!myBool) {
        println("Guess it's tails")
    } else {
        println("The coin landed on its side")
    }

    // when is the new switch
    // else is the new default
    // breaks are so passe (don't need them)
    when(myNewInt % 2){
        0 -> {
            println("Even")
        }
        1 -> println("Odd")
        else -> println("Quantum")
    }

    for (i in 0..9) {
        println(i)
    }

    for(i in 0..9){
        for(j in 0..9){
            if(j == 5){
                break
            }
            println(i.toString() + " / " + j)
        }
    }

    var myCounter = 0
    while (myCounter < 10){
        println("My counter: " + myCounter)
        ++myCounter
        // mycounter++ and mycounter.inc() also work
        // -- and .dec() also exist
    }

    /*
    while(false){}
    // don't do these!
    while(true){}
    var truth = true
    while(truth){
        // if at some point truth becomes false
    }
    while(0 == 0){}
    */
    // while(d1 == d2 && d1 == d3 && ... && d1 == d5){

    //     var allDiceEqual =d1 == d2 && d1 == d3 && ... && d1 == d5
    //     if(allDiceEqual){
    //         break
    //     }
    // }

    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    for(item in array){
        // this won't work because item is secretly val
        //item *= 5
        println(item)
    }
    // for(int i = 0; i <= array.Length() - 1; i++)
    for(index in 0..array.count()-1){
        array[index] *= 5
        println(array[index])
    }

    var myList = listOf(8, 100, 88, 11)
    for(index in 0..myList.count() - 1){
        // we can't change the value of a list
        //myList[index] = 1
        println(myList[index])
    }
    //https://www.tutorialspoint.com/difference-between-list-and-array-types-in-kotlin
}