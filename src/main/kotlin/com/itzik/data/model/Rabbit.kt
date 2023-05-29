package com.itzik.data.model

import com.itzik.routes.LIAD_BASE_URL
import kotlinx.serialization.Serializable

@Serializable
data class Rabbit(
    val name: String,
    val description: String,
    val imageUrl: String
)

fun getAllRabbits(): List<Rabbit> {
    return listOf(
        Rabbit("Carl", "brown rabbit", "$LIAD_BASE_URL/rabbits/rabbit1.jpg"),
        Rabbit("Emma", "rabbit that climbs fast", "$LIAD_BASE_URL/rabbits/rabbit2.jpg"),
        Rabbit("Florian", "rabbit with blue eyes", "$LIAD_BASE_URL/rabbits/rabbit3.jpg"),
        Rabbit("Federico", "jumping rabbit ", "$LIAD_BASE_URL/rabbits/rabbit4.jpg"),
        Rabbit("Gina", "fat rabbit", "$LIAD_BASE_URL/rabbits/rabbit5.jpg")
    )

}
