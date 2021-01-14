package scenarios

import requests._
import io.gatling.core.Predef._

package object PokemonScenarios {

    val Starter_Scenario = scenario("Getting Info on Different Starters")

        .exec(PokemonRequests.get_bulbasaur_info)
    
    
}