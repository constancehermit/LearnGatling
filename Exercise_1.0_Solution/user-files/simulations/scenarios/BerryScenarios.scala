package scenarios

import requests.BerryRequests;
import io.gatling.core.Predef._

package object BerryScenarios{

    val ThinkTime = 3
    val ThinkTimeLower = 2
    val ThinkTimeUpper = 5

    val BerryScenario = scenario("Getting Info on Berries")

        .exec(BerryRequests.GetOranInfo)
        // The Pause Method takes a Duration. All of these are acceptable: 
        .pause(1)
        .pause(1 seconds)
        .pause(1000 miliseconds)
        // If you specify two values, Gatling will treat them as a range
        // and pick a value at random between the two 
        .pause(1, 2)
        .pause(1000 miliseconds, 2000 miliseconds)

        .exec(BerryRequests.GetSitrusInfo)
        // We don't have to hardcode the durations for each pause
        // Using Parameters increases maintainability 
        .pause(ThinkTime)

        .exec(BerryRequests.GetPechaInfo)
        // We can define a range using parameters too 
        // Which is more realistic and avoid syncronicity issues
        .pause(ThinkTimeLower, ThinkTimeUpper)
        

}