package scenarios

import requests._
import io.gatling.core.Predef._

package object PokemonScenarios {

    val StarterScenario = scenario("Getting Info on Different Starters")

        .exec(PokemonRequests.GetBulbasaurInfo)
        .pause(3)
}