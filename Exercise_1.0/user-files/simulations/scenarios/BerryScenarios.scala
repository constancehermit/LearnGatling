package scenarios

import requests.BerryRequests;
import io.gatling.core.Predef._

package object BerryScenarios{

    // optional: parameterize your pauses
    // eg. by defining a val called ThinkTime and using that instead of numbers in your .pause

    // Here's a template, refer to PokemonScenarios if you get stuck!
    val YourScenarioName = scenario("human_readable_name_for_the_report_goes_here")

        .exec(BerryRequests.YourRequestName)
        // do you know what happens if you give the pause method two values? 
        .pause(3, 10)
        // add all three of your requests, and pauses

}