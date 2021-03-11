package scenarios

import requests.BerryRequests;
import io.gatling.core.Predef._

package object BerryScenarios{

    // optional: parameterize your pauses
    val ThinkTime 

    // Here's a template, refer to PokemonScenarios if you get stuck!
    val name_of_scenario_goes_here = scenario("human_readable_name_for_the_report_goes_here")

        .exec(BerryRequests.name_of_your_request_goes_here)
        // do you know what happens if you give the pause method two values? 
        .pause(3, 10)
        // add all three of your requests, and pauses

}