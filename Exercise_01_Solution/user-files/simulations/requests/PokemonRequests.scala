package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object PokemonRequests {

    val GetBulbasaurInfo =
        exec(http("get bulbasaur info")
            .get("pokemon/bulbasaur")
        )

    // write a GetSquirtleInfo request 
    val GetSquirtleInfo =
        exec(http("get squirtle info")
            .get("pokemon/squirtle")
        )

    // write a GetCharmanderInfo request
    val GetCharmanderInfo =
        exec(http("get charmander info")
            .get("pokemon/charmander")
        )
}