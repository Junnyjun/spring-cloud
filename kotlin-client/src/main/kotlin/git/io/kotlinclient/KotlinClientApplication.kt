package git.io.kotlinclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class KotlinClientApplication

fun main(args: Array<String>) {
	runApplication<KotlinClientApplication>(*args)
}
