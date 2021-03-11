package simulations

import config._
import scenarios._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation01 extends Simulation {

  private val PikachuScenarioExec = PokemonScenarios.PikachuScenario
  private val BerryScenarioExec = BerryScenarios.BerryScenario

  setUp(
      BerryScenarioExec.inject(
        nothingFor(2 seconds),
        atOnceUsers(3)
        )
  )
    .protocols(
      Config.httpProtocol
    )
    // Defining Pauses Globally
    .pauses(
      normalPausesWithStdDevDuration(3)
    )
    // Disabling Pauses (e.g. for debugging)
    //.disablePauses
    .assertions(
    )
    
}