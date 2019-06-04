# Gatling Workshop

## Prerequisites
* [**Docker**](https://www.docker.com/get-started) is installed 
* You have a **Text Editor** that you're comfortable with :)
    * _(e.g.[VSCode](https://code.visualstudio.com/), [Atom](https://atom.io/), [Sublime](https://www.sublimetext.com/) / [Notepad++](https://notepad-plus-plus.org/))_


## Setup

1. Get the [Denvazh Gatling Docker Image](https://hub.docker.com/r/denvazh/gatling) from DockerHub
    * Ensure you pull **version 3.0.3** for compatability with this workshop
    * `docker pull denvazh/gatling:3.0.3`

1. Get the Workshop Files from this GitHub Repo
    * `git clone https://github.com/constancehermit/GatlingWorkshop.git`
    * Or download and extract the .zip

## Check Setup

The Denvazh Gatling Docker Image contains a sample simulation which we can use to test that Gatling is working:
* `docker run -it --rm denvazh/gatling`
* Follow the prompts, choosing Simulation 0
* You should see the simulation run & complete: 
    * `Simulation computerdatabase.BasicSimulation completed in 23 seconds` 

### That's it! You're ready to go. :)