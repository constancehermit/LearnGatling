package scenarios

// Is this right?
import requests.PokemonRequests;

package object BerryScenarios{

    val ThinkTime = 3
    val ThinkTimeLower = 2
    val ThinkTimeUpper = 5

    val BerryScenario = scenario("Getting Info on Berries")

        .exec(BerryRequests.GetOranInfo)
        .pause(1)

        .exec(BerryRequests.GetSitrusInfo)
        .pause(ThinkTime)

        .exec(BerryRequests.GetPechaInfo)
        .pause(ThinkTimeLower, ThinkTimeUpper)
        

}