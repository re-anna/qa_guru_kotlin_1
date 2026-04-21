    package lesson_6

    import io.kotest.matchers.shouldBe
    import org.junit.jupiter.api.DisplayName
    import org.junit.jupiter.api.Test

    class EnumTest {

        @Test
        @DisplayName("Enum other student equals expected Student")
        fun compareFromEnum() {
            val actual = StudentsEnum.STUDENT_OTHER.toStudent()
            val expected = Student(1,"Anna", "Evgenieva", 40, "Arts")

            actual shouldBe expected
        }
    }