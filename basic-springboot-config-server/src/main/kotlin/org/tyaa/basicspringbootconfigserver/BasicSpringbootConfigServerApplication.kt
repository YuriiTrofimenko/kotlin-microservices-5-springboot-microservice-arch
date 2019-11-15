package org.tyaa.basicspringbootconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class BasicSpringbootConfigServerApplication

fun main(args: Array<String>) {
	runApplication<BasicSpringbootConfigServerApplication>(*args)
}
