package com.test.kotlintutorial

/**
 * Created by rahamathullahrahamathullah on 7/21/17.
 */


interface InterfaceKotlin {

    fun getEmployeeDetails()

    fun getCompanyDetails()

}

class InterfaceKotlinImpl : InterfaceKotlin {

    override fun getEmployeeDetails() {
        println("Fetch employee details from DB!")
    }

    override fun getCompanyDetails() {
        println("Fetch company details from DB!")
    }

}

fun main(args: Array<String>) {

    val interImpl: InterfaceKotlin = InterfaceKotlinImpl()
    interImpl.getEmployeeDetails()
    interImpl.getCompanyDetails()
}