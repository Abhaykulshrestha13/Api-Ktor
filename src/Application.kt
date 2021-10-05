package com.example

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import registerCustomerRoutes
import registerOrderRoutes

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation){
        gson{
            setPrettyPrinting()
        }
    }
    registerCustomerRoutes()
    registerOrderRoutes()
}