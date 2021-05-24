package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object BerryRequests {

    val get_oran_info = 
        http("get oran berry info")
            .get("berry/oran/")

    val get_pecha_info = 
        http("get pecha berry info")
            .get("berry/pecha/")

    val get_cheri_info = 
        http("get cheri berry info")
            .get("berry/cheri/")

    val get_rawst_info = 
        http("get rawst berry info")
            .get("berry/rawst/")
}