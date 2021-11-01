package practice

class SimpleSpice (var name: String, var spiciness:String = "mild" ){
    val heat: Int
        get() {
            return when(spiciness){
                "mild" -> 2
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "flaming hot" -> 10
                else -> 1
            }
        }

    init {
        println("Name: $name |Spiciness: $spiciness |Heat: $heat" )
    }

    fun makeSalt() = SimpleSpice("salt")

}