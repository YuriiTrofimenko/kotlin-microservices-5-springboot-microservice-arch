package org.tyaa.eurekadiscoveryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaDiscoveryServerApplication

fun main(args: Array<String>) {
	runApplication<EurekaDiscoveryServerApplication>(*args)
}
