/*Create a variable that holds a minimum age
Ask the user to enter their age
Use a try block to make sure user enters a number
Use an if statement to check the user age against the minimum age
Display a message to the user that tells them whether they are old enough

*/
fun main(){
    val minAge = 5
    println("Hello, How old are you? *creepy smile*")
    try {
        val age = readLine()!!.toInt()
        if(age<minAge){
            println("Hmm you're to young, go away! NEXT!")
        }
        else{
            println("OOOHOHOH!! YESS!! PERFECT! *evil smile* ")
            println("come, enter through this door")
        }
    }
    catch (e:Exception){
        println("I only asked for your age! OFF WITH HIS HEAD!! *angry red face* ")
    }
}