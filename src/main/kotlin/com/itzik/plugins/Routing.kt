package com.itzik.plugins

import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        // randomRabbit()

        get("/notes") {

        }











        static {
            resources("static")
        }
    }
}

