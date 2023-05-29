package com.itzik.routes

import com.itzik.data.model.Rabbit
import com.itzik.data.model.getAllRabbits
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.1.200:8080"
private const val IPHONE_BASE_URL="http://172.20.10.3:8080"
const val LIAD_BASE_URL="http://10.100.102.120:8080"


fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
        HttpStatusCode.OK,
            getAllRabbits().random()
        )
    }
}