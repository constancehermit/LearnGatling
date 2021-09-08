package simulations

import config._
import scenarios._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation01 extends Simulation {

  private val PikachuScenarioExec = PokemonScenarios.PikachuScenario
  // Add your Berry Scenario 

  setUp(
      // Use your Berry Scenario here instead
      PikachuScenarioExec.inject(
        nothingFor(2 seconds),
        atOnceUsers(3)
        )
  )
    .protocols(
      Config.httpProtocol
    )
    // Optional: Define Global Pauses, using .Pauses()
    // Optional: Disable Pauses, using .Pauses()
    .assertions(
    )
    
}