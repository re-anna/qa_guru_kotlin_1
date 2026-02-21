package lesson_4

data class Students(
    var name: String,
    var surName: String,
    var age: Int?,
    var level: Int?,
    val teacher: String?
)