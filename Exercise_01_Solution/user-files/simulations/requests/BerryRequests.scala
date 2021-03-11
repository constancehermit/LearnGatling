package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object BerryRequests {

    val GetOranInfo = 
        exec(http("get oran berry info")
            .get("berry/oran/")
        )

    val GetSitrusInfo = 
        exec(http("get sitrus berry info")
            .get("berry/sitrus/")
        )

    val GetPechaInfo = 
        exec(http("get pecha berry info")
            .get("berry/pecha/")
        )
    
}