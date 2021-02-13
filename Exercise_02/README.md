# Exercise 2: Scenarios
> To make reuse and maintenance as easy as possible, I've stored config, requests, and scenarios in their own packages (which you can think of as modules). To add requests to a scenario, you'll need to first  import the appropriate package.


## Goal
- Understand how to import and reference requests in scenarios

## Exercises
### Debugging 
- Run the simulation in this directory. You should get an error! 
- Read the Error Message and open the file the compiler found the error in.
- Something wasn't found. Fix this using an import. 
### Adding more Requests to the Scenario
- Add the GetSquirtleInfo and GetCharmanderInfo requests to StarterScenario
- Include **pauses** between requests

## Useful Links
- [Gatling: Scenario](https://gatling.io/docs/current/general/scenario/)
- [Scala: Import](https://docs.scala-lang.org/tour/packages-and-imports.html)

---
## Notes
> We use pauses to more closely simulate real user behaviour. Humans need a lot more thinking time between actions than machines!