package aquarium

fun main (args: Array<String>){
 buildAquarium()
}

private fun buildAquarium(){
 val myAquarium = Aquarium() //mesma coisa que "new": é um construtor

 println("Length: ${myAquarium.length} " +
 " Width: ${myAquarium.width} " +
 " Height: ${myAquarium.height} ") //Kotlin automaticamente administra os getters e setters

 myAquarium.height = 80
 println("Height: ${myAquarium.height} cm")
 println("Volume: ${myAquarium.volume} liters")
}