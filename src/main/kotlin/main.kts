
//How to set up variables
var name = "Mateus"

// Immutable variable
val last_name = "Goncalves De Ouro"

var age = 24

//specify variable data type
var height : Int = 185

//immutable list variable
var listOfFriends = listOf("Sol", "Dmitry", "Marcus", "Usman", "Tomas", "Hazeem")

//mutable list

var shoes = mutableListOf("DC", "Nike", "Adidas", "C1rca", "Champion")
// adding to mutable list
shoes.add("Emerica")

// hashmaps/dictionaries in kotlin
var favouriteColors = mapOf("Mateus" to "blue", "Sol" to "blue", "Tomas" to "green", "Hazeem" to "red")
println(favouriteColors["Mateus"])

fun shoeCollection(){
    for(shoe in shoes){
        println("This is you $shoe shoe")
    }
}
//array

var favouriteNumbers = arrayOf(333, 666 ,999 ,222 ,444,777)

// acessing index
print(listOfFriends[0])

// function with parameters
fun presentation(name: String, last_name : String, age : Int, height : Int){
    println("\nMy name is $name $last_name and I am $age years old, and I am $height cm tall" )
}

fun allowedToDrink(age : Int){
    if (age > 18) {
        println("You are allowed to drink since you are $age years old")
    } else {
        println(" You are not allowed to drink as you are younger than 18")
    }
}

fun takingShots(age : Int ){
    for (i in 1..age) {
        println("SHOTS!")
        println("shot number $i")
    }
}
fun printListOfFriends(){
    for (friend in listOfFriends){
        println("This is your friend $friend say hi ")
    }
}

class pet(name : String, age : String, typeofAnimal : String) {
    var name = name
    var age = age
    var typeofAnimal = typeofAnimal

    fun petInfo(){
        println("\nThis is your pet $name and its $age!" +
                "such a cute $typeofAnimal")
    }
}


var dona = pet("Dona", "5 Months old", "Turtle")
dona.petInfo()

presentation(name, last_name, age, height)
allowedToDrink(age)
takingShots(age)
printListOfFriends()
