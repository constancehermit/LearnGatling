package simulations

import config._
import scenarios._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class MyIllustrativeSimulation extends Simulation {

  private val _PikachuScenarioExec =  PikachuScenarios.Pikachu_Scenario
  private val _StarterScenarioExec =  StarterScenarios.Starters_Scenario
  private val _PokeballScenarioExec = PokeballScenarios.Pokeball_Scenario
  private val _BerryScenarioExec =    BerryScenarios.Berry_Scenario

  setUp(
      _PikachuScenarioExec.inject(
        nothingFor(2 seconds),
        atOnceUsers(2)
        ),
      _StarterScenarioExec.inject(
        rampUsers(2) during (5 seconds)
        ), 
      _PokeballScenarioExec.inject(
        constantUsersPerSec(2) during (5 seconds)
        ),
      _BerryScenarioExec.inject(
        nothingFor(10 seconds),
        atOnceUsers(5)
      )
  )
    .protocols(
      Config.httpProtocol
    )
    .pauses(
      normalPausesWithStdDevDuration(3)
    )
    .assertions(
    )
    
}