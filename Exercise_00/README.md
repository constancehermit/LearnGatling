## A Note on Plugins
> I've tried to make this workshop as environment-agnostic as possible by using docker, and as such it is possible to complete using only a text editor and terminal. Having said that, I do recommend getting a Scala Plugin for your editor (for syntax highlighting), or if you prefer to use an IDE, you can follow the instructions in the [Gatling docs](https://gatling.io/docs/current/installation/#:~:text=Since%203.0%2C%20Gatling%20requires%20Scala%202.12.) to install the appropriate plugin there. 

# Exercise 0: Running the Simulation
> I've included a run_simulation script to simplify things by hiding all the docker stuff. Fire and forget or go a little deeper, it's up to you! (: 

## Learning Goal
- Understand how to compile your code and run the simulation

## Exercises

- Open your terminal and navigate to this directory (Exercise_00)
- Run the Simulation using the appropriate run script: \
`./run_simulation_bash.sh` \
or `./run_simulation_cmd.sh`

> Before Gatling can execute your Simulation, it needs to compile your code using ZincCompiler. That's what you'll see first in your terminal, output from Zinc. If you have any errors in your code, here's where you'll find out!

- After compilation finishes you'll be prompted to enter a run description
- We don't need this, so just hit enter and Gatling will run the simulation. 

> Results will be printed to the terminal as the simulation executes, and saved to /results once it finishes

### Optional
- Investigate the contents of the run script

---

## Notes
> ZincCompiler is an incremental Scala Compiler. Unlike ordinary compilers (which make clean builds by re-building everything), incremental compilers only re-compile code which has changed. It aims for faster compilation without sacrificing correctness. 

> Zinc is integrated in the Maven Scala Plugin as well as other common build tools, so you'll probably be using it if you add Gatling to your project after this workshop. (:

## Further Reading

- [ZincCompiler on Github](https://github.com/sbt/zinc)
- [Incremental Compilers Wiki](https://en.wikipedia.org/wiki/Incremental_compiler)
- [Crash Course: Compilers in Language Design](https://increment.com/programming-languages/crash-course-in-compilers/)
