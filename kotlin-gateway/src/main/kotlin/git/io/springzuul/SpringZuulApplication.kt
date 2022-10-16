package git.io.springzuul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringZuulApplication

fun main(args: Array<String>) {
	runApplication<SpringZuulApplication>(*args)
}
