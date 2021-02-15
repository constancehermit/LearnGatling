# Load Testing with Gatling
## Learn the Basics
---

## Prerequisites
* [**Docker**](https://www.docker.com/get-started) is installed 
    * _If you're on Windows and installing for the first time: [check the requirements](https://docs.docker.com/docker-for-windows/wsl/) \
    you may need to [enable WSL2 and install a linux distro](https://docs.microsoft.com/en-us/windows/wsl/install-win10) first_
* You have a **Text Editor** that you're comfortable with
    * _(e.g.[VSCode](https://code.visualstudio.com/), [Atom](https://atom.io/), [Sublime](https://www.sublimetext.com/) / [Notepad++](https://notepad-plus-plus.org/))_
* You have a **Terminal** you're comfortable with
    * _(The system default is fine if you don't have a preference already!)_

---

## Setup

### 1. Gating, our Testing Tool


* Get the [Denvazh Gatling Docker Image](https://hub.docker.com/r/denvazh/gatling) from DockerHub
    * Ensure you pull **version 3.2.1** for compatability with this workshop
    * `docker pull denvazh/gatling:3.2.1`

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

---

## Test the Setup

### Gatling

The Denvazh Gatling Docker Image contains a sample simulation which we can use to test that Gatling is working:
* `docker run -it --rm denvazh/gatling`
* Follow the prompts, choosing Simulation 0
* You should see the simulation run & complete: 
    * `Simulation computerdatabase.BasicSimulation completed in 23 seconds` 

### PokeApi

To keep everything tidy, we'll be running our SUT with Docker too. The PokeAPI GitHub page has a step-by-step on how to do this under the heading [Docker Compose](https://github.com/PokeAPI/pokeapi/). 
* After following these steps you should see some JSON at [localhost/api/v2/](localhost/api/v2/)
* You can run `docker stop $(docker ps -a -q)` to stop all running containers
* You can run `docker-compose up -d` in the PokeAPI directory to start them when you're ready