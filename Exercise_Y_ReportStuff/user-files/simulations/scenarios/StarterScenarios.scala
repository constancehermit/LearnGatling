package scenarios

import requests._
import io.gatling.core.Predef._

package object StarterScenarios {

    val Starters_Scenario = scenario("Learning About Starters")

        .group("get starter infos"){
             exec(PokemonRequests.get_bulbasaur_info)
            .pause(2)
            .exec(PokemonRequests.get_squirtle_info)
            .pause(2)
            .exec(PokemonRequests.get_charmander_info)
            .pause(2)
        }     
    
}