package lesson_4

import org.junit.jupiter.api.Test

class Tests {
    val student1 = Students("Anna", "Ivanova", 12, 6, null)
    val student2 = Students("Vitalya", "Vitaleev", null, null, null)

    // проверка nullable через let + Elvis
    @Test
    fun checkNullAge() {
        student2.age?.let {
            println("${student2.name} age is $it")
        } ?: run {
            println("${student2.name} age is null")
        }
    }

    //подставляю дефолтные значения + логирую через also
    @Test
    fun putNewAgeForSutdent() {
        student2.apply {
            age = age ?: 8
            level = level ?: 3
        }
        student2.also { println(" Student: $it") }
        println("${student2.age} - new age of ${student2.name}. ${student2.level} - new level")
    }

    @Test
    fun checkTeacher(){
        student2.teacher?.let{
            println("${student2.name} teacher is $it")
        } ?: run {
            println("${student2.name} has no teacher, please find new one")

        }
    }
}
