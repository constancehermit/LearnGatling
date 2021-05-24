package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object PokemonRequests {

    val get_pikachu_info =
        http("get pikachu info")
            .get("pokemon/pikachu/")
            .check(jsonPath("$.id").saveAs("pikachuId"))
            .check(jsonPath("$.held_items[0].item.name").saveAs("pikachuFirstHeldItem"))
            .check(jsonPath("$.types[0].type.name").saveAs("pikachuFirstType"))

    val get_bulbasaur_info =
        http("get bulbasaur info")
            .get("pokemon/bulbasaur/")

    val get_squirtle_info =
        http("get squirtle info")
            .get("pokemon/squirtle/")

    val get_charmander_info =
        http("get charmander info")
            .get("pokemon/charmander/")


}