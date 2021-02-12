package simulations

import config._
import scenarios._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation01 extends Simulation {

  private val _StarterScenarioExec = PokemonScenarios.Starter_Scenario

  setUp(
      _StarterScenarioExec.inject(
        nothingFor(5 seconds),
        atOnceUsers(2),
        rampUsers(5) during(5 seconds)
        )
  )
    .protocols(
      Config.httpProtocol
    )
    .assertions(
    )
    
}