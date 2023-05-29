package com.itzik.plugins

import com.itzik.routes.randomRabbit
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        randomRabbit()
        static {
            resources("static")
        }
    }
}
