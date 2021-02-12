package simulations

import config._
import scenarios._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation01 extends Simulation {

  private val StarterScenarioExec = PokemonScenarios.StarterScenario

  setUp(
      _StarterScenarioExec.inject(
        nothingFor(2 seconds),
        atOnceUsers(3),
        rampUsers(5) during(5 seconds)
        )
  )
    .protocols(
      Config.httpProtocol
    )
    .assertions(
    )
    
}