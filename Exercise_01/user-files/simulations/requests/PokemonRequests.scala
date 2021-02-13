package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object PokemonRequests {

    val GetBulbasaurInfo =
        exec(http("get bulbasaur info")
            .get("pokemon/bulbasaur")
        )

    // write a GetSquirtleInfo request 

    // write a GetCharmanderInfo request
}