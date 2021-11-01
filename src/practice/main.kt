package practice

fun main(args: Array<String>){

    val spices1 = listOf(
        SimpleSpice("curry", "mild"),
        SimpleSpice("pepper", "medium"),
        SimpleSpice("cayenne", "spicy"),
        SimpleSpice("ginger", "mild"),
        SimpleSpice("red curry", "medium"),
        SimpleSpice("green curry", "mild"),
        SimpleSpice("hot pepper", "flaming hot")
    )

    val spices = spices1.filter { it.heat <= 5 }
}