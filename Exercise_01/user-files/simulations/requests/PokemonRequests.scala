package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object PokemonRequests {

    val get_bulbasaur_info =
        exec(http("get bulbasaur info")
            .get("pokemon/bulbasaur")
        )
        .pause(3)
}