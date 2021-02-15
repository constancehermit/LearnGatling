package scenarios

import requests._
import io.gatling.core.Predef._

package object PokemonScenarios {

    val PikachuScenario = scenario("Getting Info on Pikachu")

        .exec(PokemonRequests.GetPikachuInfo)
        .pause(3)
}