package com.itzik

import io.ktor.server.application.*
import com.itzik.plugins.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        EngineMain.main(args)
    }.start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureHTTP()
    configureRouting()
}
