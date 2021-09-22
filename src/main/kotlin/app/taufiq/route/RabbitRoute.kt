package app.taufiq.route

import app.taufiq.data.Rabbits
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

const val BASE_URL = "http://10.32.66.18:8080"
val rabbits = listOf(
    Rabbits("Carl", "a cute rabbits brown colors", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbits("Emma", "a cute rabbits White colors", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbits("Florian", "a cute rabbits like to climb", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbits("Federico", "a cute rabbits always hungry", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbits("Gina", "a cute rabbits black colors", "$BASE_URL/rabbits/rabbit5.jpg"),
)

fun Route.randomRabbit(){
    get("/randomrabbits") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }

}