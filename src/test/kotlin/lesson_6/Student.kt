package lesson_6

data class Student(
    val studentID: Int,
    val firstName: String,
    val secondName: String,
    val age: Int,
    val course: String
)

val defaultStudent = Student(0, "Ivan", "Ivanov", 20, "Math")


