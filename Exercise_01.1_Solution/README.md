# Exercise 01.1: Debugging

> Test Code is just as prone to bugs as Production Code, and debugging is a valuable skill! Error Messages are meant to be helpful, but can range from pretty informative to infuriatingly cryptic... 

# Solutions

## BerryScenarios

``` 
[main] ERROR io.gatling.compiler.ZincCompiler$ - /opt/gatling/user-files/simulations/scenarios/BerryScenarios.scala:12:25: not found: value scenario
    val BerryScenario = scenario("Getting Info on Berries")
```
> Zinc is telling us that it can't find the scenario() method. Where would it normally find that method? It's a core part of Gatling's functionality! And therein lies the clue. In order to use Gatling's methods, you need to import them. 

``` import io.gatling.core.Predef._ ```

> If you've accidentally missed an import, you'll see errors along these lines, telling you that methods can't be found. 

---

```
[main] ERROR io.gatling.compiler.ZincCompiler$ - /opt/gatling/user-files/simulations/scenarios/BerryScenarios.scala:15:15: not found: value BerryRequests
        .exec(BerryRequests.GetOrangeInfo)
```
> BerryRequests can't be found now. That's not a Gatling method, we define our own Requests, in our Requests package. Did we import that?

``` import requests.PokemonRequests; ```

> There's the problem. We imported the PokemonRequests, instead of BerryRequests. Easily done if we're hitting enter on IDE auto-suggestions without reading carefully! 

---

```
[main] ERROR io.gatling.compiler.ZincCompiler$ - /opt/gatling/user-files/simulations/scenarios/BerryScenarios.scala:14:29: object GetOrangeInfo is not a member of package requests.BerryRequests
        .exec(BerryRequests.GetOrangeInfo)
```

> GetOrangeInfo couldn't be found in BerryRequests. Why is that? Ah! If we have a look in BerryRequests we find that the method is actually called GetOranInfo. These kinds of typos can be really hard to catch, because our brains are really good at autocompleting and correcting things at a subconscious level. 

``` .exec(BerryRequests.GetOranInfo) ```

> My advice when debugging is to slow right down and try not to let your brain autocomplete and skim lines you think are fine. Really read each word carefully! 

---

## BerryRequests

``` 
[main] ERROR io.gatling.compiler.ZincCompiler$ - /opt/gatling/user-files/simulations/requests/BerryRequests.scala:9:9: not found: value exec
        exec(http("get oran berry info")
```

> Zinc can't find the exec() method. We saw something really similar earlier didn't we? Exec is a core part of Gatling's functionality, so we should check the imports. 

``` import io.gatling.core.Predef._ ```

> There's another related error here, though you wouldn't perhaps know it just from reading the error message on it's own: 

```
[main] ERROR io.gatling.compiler.ZincCompiler$ - /opt/gatling/user-files/simulations/requests/BerryRequests.scala:9:14: overloaded method value http with alternatives:
  (requestName: io.gatling.core.session.Expression[String])io.gatling.http.request.builder.Http <and>
  (implicit configuration: io.gatling.core.config.GatlingConfiguration)io.gatling.http.protocol.HttpProtocolBuilder
 cannot be applied to (String)
        exec(http("get oran berry info")
```

> If we add the missing import and re-build, this error goes away. Sometimes there's a chain of failure if one key method is missing, affecting many others and giving you a long list of problems that get resolved when you fix the root cause. 

# Optional Exercise

> I think the best way to learn what they mean and how to resolve them (as well as making them less scary!) is to intentionally break your own code and find out what happens.

- Break your code. Introduce typos, delete lines, see what happens! 