package simulations

import config._
import scenarios._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation01 extends Simulation {

  private val PikachuScenarioExec = PokemonScenarios.PikachuScenario

  setUp(
      PikachuScenarioExec.inject(
        nothingFor(2 seconds),
        atOnceUsers(3)
        )
  )
    .protocols(
      Config.httpProtocol
    )
    .assertions(
    )
    
}