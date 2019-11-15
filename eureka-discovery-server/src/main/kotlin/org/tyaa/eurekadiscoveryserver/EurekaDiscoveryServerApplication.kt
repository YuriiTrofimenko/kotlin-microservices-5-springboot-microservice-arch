package org.tyaa.eurekadiscoveryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaDiscoveryServerApplication

fun main(args: Array<String>) {
	runApplication<EurekaDiscoveryServerApplication>(*args)
}
