package com.itzik.routes

import com.itzik.data.model.Rabbit
import com.itzik.data.model.getAllRabbits
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


object Constants {
    const val BASE_URL="http://itzik-be.herokuapp.com"
}


fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
        HttpStatusCode.OK,
            getAllRabbits().random()
        )
    }
}