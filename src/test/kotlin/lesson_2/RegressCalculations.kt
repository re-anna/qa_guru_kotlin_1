package lesson_2

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Feature("Calculations")
@Story("Calculator")

class RegressCalculations {

        val a=5
        val b=5


        @Test
        @DisplayName("Sum of 2 numbers")
        @Tag("regression")
        fun testSum() {
            val actualResult = a+b
            val expectedResult = 10

            expectedResult shouldBe actualResult

            assertEquals(expectedResult,actualResult, "Сумма а+б не верная")
        }

        @Test
        @DisplayName("Minus 2 numbers")
        @Tag("regression")
        fun testMinus() {
            val actualResult = a - b
            val expectedResult = 0

            assertEquals(expectedResult, actualResult, "Разница а-б не верная")
        }
}