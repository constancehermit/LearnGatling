package scenarios

// we're missing an import 
import io.gatling.core.Predef._

package object PokemonScenarios {

    val StarterScenario = scenario("Getting Info on Different Starters")

        .exec(PokemonRequests.GetBulbasaurInfo)
        .pause(3)
        // add GetSquirtleInfo and GetCharmanderInfo 
}