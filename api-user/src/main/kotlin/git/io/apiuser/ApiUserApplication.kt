package git.io.apiuser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class ApiUserApplication

fun main(args: Array<String>) {
    runApplication<ApiUserApplication>(*args)
}
