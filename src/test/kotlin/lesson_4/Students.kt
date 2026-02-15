package lesson_4

data class Students(
    var name: String,
    var surName: String,
    var age: Int?,
    var level: Int?,
    val teacher: String?
){
    val defaultTeacher: String

    init {
        defaultTeacher = if ( teacher == null){
            println("Teacher is null, using text 'Need to find teacher'")
            "Need to find teacher"
        } else {
            teacher
        }
        }
    }