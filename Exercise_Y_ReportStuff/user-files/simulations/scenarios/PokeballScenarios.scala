package scenarios

import requests._
import io.gatling.core.Predef._

package object PokeballScenarios {

    val Pokeball_Scenario = scenario("Learning About Pokeballs")

        .group("get random pokeball infos"){
             repeat(5) {
                ItemRequests.get_random_pokeball_info
                .pause(3)
            }   
        }   
            
}