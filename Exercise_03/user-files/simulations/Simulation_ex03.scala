package simulations

import config._
// we're missing an import
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation03 extends Simulation {

  private val StarterScenarioExec = PokemonScenarios.StarterScenario

  setUp(
      StarterScenarioExec.inject(
        nothingFor(2 seconds),
        atOnceUsers(3)
        // ramp up 5 more users over 5 seconds
        )
  )
    .protocols(
      Config.httpProtocol
    )
    .assertions(
    )
    
}