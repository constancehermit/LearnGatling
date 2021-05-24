package scenarios

import requests._
import io.gatling.core.Predef._

package object PikachuScenarios {

    val Pikachu_Scenario = scenario("Learning About Pikachu")

        .exec(PokemonRequests.get_pikachu_info)

        .exec { session => println("PIKACHU ID"); session }
        .exec { session => println(session("pikachuId").as[String]); session }
        .exec { session => println("PIKACHU ITEM"); session }
        .exec { session => println(session("pikachuFirstHeldItem").as[String]); session }
        .exec { session => println("PIKACHU TYPE"); session }
        .exec { session => println(session("pikachuFirstType").as[String]); session }
    
}