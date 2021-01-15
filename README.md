# Load Testing with Gatling

We're going to be running Gatling in a Docker Container, because this allows us to focus on learning about the tool itself without worrying about installation and configuration. Don't worry too much about understanding how Docker works if you haven't used it before, just follow the [Getting Started Guide](https://www.docker.com/get-started). 

## Prerequisites
* [**Docker**](https://www.docker.com/get-started) is installed 
* You have a **Text Editor** that you're comfortable with
    * _(e.g.[VSCode](https://code.visualstudio.com/), [Atom](https://atom.io/), [Sublime](https://www.sublimetext.com/) / [Notepad++](https://notepad-plus-plus.org/))_
* You have a **Terminal** you're comfortable with
    * _(The system default is fine)_

## Setup

### 1. Gating, our Testing Tool


* Get the [Denvazh Gatling Docker Image](https://hub.docker.com/r/denvazh/gatling) from DockerHub
    * Ensure you pull **version 3.0.3** for compatability with this workshop
    * `docker pull denvazh/gatling:3.0.3`

### 2. PokeAPI, our SUT (System Under Test)

* Clone or Copy the [PokeAPI GitHub Repo](https://github.com/PokeAPI/pokeapi/)
    * I put mine under /Projects/TargetPractice
    * `git clone https://github.com/PokeAPI/pokeapi.git`
    * Or download and extract the .zip

### 3. The Workshop Exercises

* Clone or Copy the [Workshop GitHub Repo](https://github.com/constancehermit/GatlingWorkshop)
    * I put mine under /Projects/GatlingWorkshop
    * `git clone https://github.com/constancehermit/GatlingWorkshop.git`
    * Or download and extract the .zip

## Getting Started

### Gatling

The Denvazh Gatling Docker Image contains a sample simulation which we can use to test that Gatling is working:
* `docker run -it --rm denvazh/gatling`
* Follow the prompts, choosing Simulation 0
* You should see the simulation run & complete: 
    * `Simulation computerdatabase.BasicSimulation completed in 23 seconds` 

### PokeApi

To keep everything tidy, we'll be running our SUT with Docker too. The PokeAPI GitHub page has a step-by-step on how to do this under the heading [Docker Compose](https://github.com/PokeAPI/pokeapi/). 
* After following these steps you should see some JSON at [localhost/api/v2/](localhost/api/v2/)
* You can run `docker stop $(docker ps -a -q)` to stop all running containers now, we'll start them up again in the workshop 