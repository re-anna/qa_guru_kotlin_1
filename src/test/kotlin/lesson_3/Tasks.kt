package lesson_3

import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Tasks {
    //Напишите тест, который будет проверять что массив пустой
    @Test
    @DisplayName("Проверка пустого массива")
    fun checkEmptyArray(){
        val array = emptyArray<Int>()
        assertTrue(array.isEmpty()
        )
    }

    //Напишите тест, который проверит, что массив НЕ пустой
    @Test
    @DisplayName("Проверка пустого массива")
    fun checkNotEmptyArray(){
        val array = arrayOf(2,5,8)
        assertTrue(array.isNotEmpty()
        )
    }

    //Напишите тест, который достанет первый элемент из массива и проверит, что соответствует тому, что вы ждете
    @Test
    @DisplayName("Проверка первого элемента массива")
    fun checkFirstArrayElement(){
        val array = arrayOf("One", "Two", "Five")
        array.first().shouldBe("One")
    }

    //Также посмотрите, какие есть полезные методы в Kotest  (кроме shoudBe) и воспользуйтесь ими
    @Test
    @DisplayName("Проверка элементов массива")
    fun checkAllArrayElements(){
        val array = arrayOf("One", "Two", "Five")
        array.first().shouldNotBe(5)
        array[2].shouldNotBeNull()
        array.last().shouldBe("Five")
    }

    @Test
    @DisplayName("Проверка элементов листа")
    fun checkListElements(){
        val list = listOf<Int>(2,3,6,10,220,1230)
        list.shouldContain(6)
        list.shouldContainAll(6,2,3)
        list.shouldContainExactly(2,3,6,10,220,1230)
        list.shouldHaveSize(6)

    }
    }