package com.test.kotlintutorial

/**
 * Created by rahamathullahrahamathullah on 7/19/17.
 */

class JavaCodeToKotlnCode {

     fun main(args: Array<String>) {

         var childNames: List<String> = listOf("child1", "child2")

         val obj:POJOJava = POJOJava("abcd", 1, true, childNames)



         println("Kotlin main method!");

        val p_b: Byte = 65
        val p_c = 'a'
        val p_sh: Short = 65
        val p_i = 5
        val p_l = 10L
        val p_f = 3f
        val p_d = 10.34
        val p_bo = true
        val p_s = "java2kotlin"


         val w_b = 65
         val w_c = 'a'
         val w_sh = 65
         val w_i = 5
         val w_l = 10L
         val w_f = 3f
         val w_d = 10.34
         val w_bo = true
         val w_s = "java2kotlin"


    }

    fun getName(id: Int): String {
        return "Kotlin"
    }

}
