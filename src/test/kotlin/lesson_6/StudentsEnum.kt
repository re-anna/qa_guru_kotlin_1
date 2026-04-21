package lesson_6

enum class StudentsEnum (

    val studentID: Int,
    val firstName: String,
    val secondName: String,
    val age: Int,
    val course: String
    ){
        DEFAULT(0,"Ivan", "Ivanov", 20, "Math"),
        STUDENT_OTHER(1,"Anna", "Evgenieva", 40, "Arts");

        fun toStudent(): Student = Student(
            studentID = studentID,
            firstName = firstName,
            secondName = secondName,
            age = age,
            course = course,
        )
}