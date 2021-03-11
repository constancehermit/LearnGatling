package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object BerryRequests {

    // Here's a template, refer to PokemonRequests if you're stuck!
    val name_of_your_request_goes_here = 
        exec(http("human_readable_name_of_request_FOR_THE_REPORT_goes_here")
            .get("url_goes_here")
        )
    
}