package git.io.apiboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class ApiBoardApplication

fun main(args: Array<String>) {
    runApplication<ApiBoardApplication>(*args)
}
