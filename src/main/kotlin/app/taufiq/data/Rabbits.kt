package app.taufiq.data

import kotlinx.serialization.Serializable

@Serializable
data class Rabbits(
    val name: String,
    val desription: String,
    val imageUrl: String
)
