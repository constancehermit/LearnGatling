package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object ItemRequests {

    val pokeballFeeder = csv("resources/pokeballs.csv").random

    val get_random_pokeball_info =  
        feed(pokeballFeeder)
        .exec(
            http("get ${Pokeball} info")
            .get("item/${Pokeball}/")
        )

    val get_potion_info = 
        http("get pokeball info")
            .get("item/potion/")

    val get_antidote_info = 
        http("get antidote info")
            .get("item/antidote/")

}