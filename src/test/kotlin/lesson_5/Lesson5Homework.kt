package lesson_5

import lesson_5.CompanionAssert.Companion.shouldBeUpperCase
import lesson_5.CompanionAssert.Companion.shouldBeValidNumber
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CompanionAssert {
    companion object {

        private val PHONE_REGEX_PLUS_IS_OPTIONAL = Regex("^\\+?[1-9]\\d{1,14}$")

        fun String.validatePhoneNumber(): Boolean =
            PHONE_REGEX_PLUS_IS_OPTIONAL.matches(this)


        fun String.isUpperCaseText(): Boolean =
            this.isNotEmpty() && this == this.uppercase()


        infix fun String.shouldBeValidNumber(expected: Boolean) {
            val actual = this.validatePhoneNumber()
            if (actual != expected) {
                throw AssertionError(
                    "Номер телефона не прошел валидацию"
                )
            }
        }

        infix fun String.shouldBeUpperCase(expected: Boolean) {
            val actual = this.isUpperCaseText()
            if (actual != expected) {
                throw AssertionError("Проблема с верхним регистром")
            }
        }
    }
}

class Lesson5Homework {

    data class TestData(
        val phone: String,
        val mobileProvider: String
    )

    val correctData = TestData("+79228767888", mobileProvider = "MEGAFON")
    val invalidData = TestData("89222232323233233", mobileProvider = "unknown")

    @Test
    @DisplayName("Проверка валидации")
    fun validationCheck() {
        correctData.phone shouldBeValidNumber true
        invalidData.phone shouldBeValidNumber false

        correctData.mobileProvider shouldBeUpperCase true
        invalidData.mobileProvider shouldBeUpperCase false
    }
}