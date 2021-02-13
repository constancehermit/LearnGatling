package scenarios

// we're missing an import 
import requests.PokemonRequests
import io.gatling.core.Predef._

package object PokemonScenarios {

    val StarterScenario = scenario("Getting Info on Different Starters")

        .exec(PokemonRequests.GetBulbasaurInfo)
        .pause(3)
        // add GetSquirtleInfo and GetCharmanderInfo 
        .exec(PokemonRequests.GetSquirtleInfo)
        .pause(3)
        .exec(PokemonRequests.GetCharmanderInfo)
        .pause(3)
}