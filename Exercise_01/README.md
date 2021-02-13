## A Note on PokeAPI
> Did you start up [PokeAPI](https://pokeapi.co/) and have a look around yet? The instructions for getting the system running are in the root README of this project. Once it's running, I recommend using an API testing tool such as [Postman](https://www.postman.com/) to explore (rather than a web browser) because it's easier to read pretty print. 

# Exercise 1: Requests
> Our workload is made up of requests. We vary which requests we send, the order they arrive in, how many users are sending them, and how fast, but the individual transactions remain at the core of what we do. They determine which components of, and paths through, the system we're actually putting the stress on.

## Goal
- Practice writing requests

## Exercises
- Open the /requests/PokemonRequests.scala file in this directory
- Write a request for info on **Squirtle** from the **pokemon endpoint**
- Write a request for info on **Charmander** from the **pokemon endpoint**

## Useful Links
- [Gatling: HTTP Request](https://gatling.io/docs/current/http/http_request/?highlight=http%20method)
- [PokeAPI: Pokemon Endpoint](https://pokeapi.co/docs/v2#pokemon)

---
## Notes
> I've written example solutions to these exercises, and built up on those going into each subsequent exercise. For example, my solution for exercise 1 is included in the existing code in exercise 2. 
