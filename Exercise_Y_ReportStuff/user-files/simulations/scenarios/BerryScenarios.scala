package scenarios

import requests._
import io.gatling.core.Predef._

package object BerryScenarios {

    val Berry_Scenario = scenario("Learning About Berries")

        .exec(BerryRequests.get_oran_info)
        .pause(2)
        .exec(BerryRequests.get_cheri_info)
        .pause(2)
        .exec(BerryRequests.get_pecha_info)
        .pause(2)
    
}