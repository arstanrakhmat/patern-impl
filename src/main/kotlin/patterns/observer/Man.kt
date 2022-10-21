package patterns.observer

data class Man(val name: String, val lastname: String) : ManBehavior {

    override fun getClothes(degree: Int) {
        println("degrees $degree")
        if (degree > 0) {
            println("warn")
        } else {
            println("cold")
        }
    }
}