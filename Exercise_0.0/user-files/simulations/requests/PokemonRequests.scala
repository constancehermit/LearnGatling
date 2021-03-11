package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object PokemonRequests {

    val GetPikachuInfo =
        exec(http("get pikachu info")
            .get("pokemon/pikachu/")
        )
}