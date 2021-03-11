## A Note on PokeAPI
> Did you start up [PokeAPI](https://pokeapi.co/) and have a look around yet? The instructions for getting the system running are in the root README of this project. Once it's running, I recommend using an API testing tool such as [Postman](https://www.postman.com/) to explore (or an extension like [JSON Formatter](https://chrome.google.com/webstore/detail/json-formatter/bcjindcccaagfpapjjmafapmmgkkhgoa?hl=en) in your browser) because it's easier to read pretty print. 

# Exercise 1: Requests, Scenarios & Pauses

> Scenarios are the scripts we write to emulate real customer journeys through our application. We include pauses because real users, unlike their virtual counterparts, need thinking time between actions. 

## Learn How To... 
- Write executable requests with __http__ and __exec__
- Build scenarios out of __requests__ and __pauses__

## Resources
- [Gating: HTTP](https://gatling.io/docs/current/http/http_request/)
- [Gatling: Exec](https://gatling.io/docs/current/general/scenario/?highlight=exec)
- [Gatling: Pause](https://gatling.io/docs/current/general/scenario/?highlight=pause)
- [PokeAPI: Berries](https://pokeapi.co/docs/v2#berries-section)

## Exercises

> I've left comments in the relevant files to help you!

- Open BerryRequests.scala under /requests
- Write Requests to get info on three berries of your choice
- Open BerryScenario.scala under /scenarios
- Write a Scenario in which all your berry requests appear
- Add Pauses to your scenario to emulate human thinking time
- Change the Simulation to use your new Scenario

### Optional 

> In this exercise we defined our pauses [at the scenario level](https://gatling.io/docs/current/general/scenario/?highlight=pause%20scenario), but it is also possible to [define them globally](https://gatling.io/docs/current/general/simulation_setup/#simulation-setup-pause). 
> It's also possible to randomise the pause time by using ranges instead of static values (which is, again, more realistic), and to parameterize our values for better maintainability. 

- Change your Pauses to use ranges
- Parameterize your existing Pauses at the Scenario level 
- Define Pauses globally using normalPausesWithStdDevDuration
- Disable Pauses (useful for debugging)
 
 ## Further Reading

 - [Pauses & Synchronicity](https://doc.octoperf.com/analysis/tips/#synchronicity)