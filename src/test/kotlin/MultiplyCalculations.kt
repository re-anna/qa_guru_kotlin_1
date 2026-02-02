import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Feature("Multiply")
@Story("Calculator")

class MultiplyCalculations {

    val a=5
    val b=5


    @Test
    @DisplayName("Multiply 2 numbers")
    @Tag("multiply")
    fun testMultiply() {
        val actualResult = a*b
        val expectedResult = 25

        expectedResult shouldBe actualResult
    }

    @Test
    @DisplayName("Multiply x100")
    @Tag("multiply")
    fun testMinus() {
        val actualResult = a*100
        val expectedResult = 500

        expectedResult shouldBe actualResult
    }
}