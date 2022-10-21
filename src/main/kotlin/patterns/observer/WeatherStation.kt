package patterns.observer

import java.util.*
import kotlin.concurrent.thread

class WeatherStation {
    private val people: MutableList<ManBehavior> = LinkedList()
    var degrees = 0

    fun addMan(manBehavior: ManBehavior) {
        people.add(manBehavior)
    }

    fun removeMan(manBehavior: ManBehavior) {
        people.remove(manBehavior)
    }

    fun updateWeather() {
        degrees = Random().nextInt(200)
        people.forEach {
            it.getClothes(degree = degrees)
        }

        thread {
            updateWeather()
            Thread.sleep(2000)
        }
    }
}