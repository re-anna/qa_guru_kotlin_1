    package lesson_6

    import io.kotest.matchers.shouldNotBe
    import org.junit.jupiter.api.DisplayName
    import org.junit.jupiter.api.Test

    enum class StudentsEnum(
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
    class EnumTest {

        @Test
        @DisplayName("Enum other student equals expected Student")
        fun compareFromEnum() {
            val actual = StudentsEnum.STUDENT_OTHER.toStudent()
            val expected = Student(1,"Anna", "Evgenieva", 40, "Arts")

            actual shouldNotBe expected
        }
    }