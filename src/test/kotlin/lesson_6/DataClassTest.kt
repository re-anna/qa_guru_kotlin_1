package lesson_6

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class DataClassTest {
    @Test
    @DisplayName("Student equals default user")
    fun compareWithDefault(){
        val actual = Student( 0, "Ivan", "Ivanov", 20, "Math")
        actual shouldBe defaultStudent
    }
}