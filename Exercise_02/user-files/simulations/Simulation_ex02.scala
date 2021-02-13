package simulations

import config._
import scenarios._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation02 extends Simulation {

  private val StarterScenarioExec = PokemonScenarios.StarterScenario

  setUp(
      StarterScenarioExec.inject(
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