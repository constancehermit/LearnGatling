package config

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Config {

    val baseURL = "http://localhost:80/api/v2/"

    val httpProtocol = http
        .baseUrl(baseURL)
        //.proxy(Proxy("localhost", 8080).httpsPort(8080))
        .acceptHeader("*/*")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
        .disableCaching

}