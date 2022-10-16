package git.junny.kotlincloud.chap1.controller

import git.junny.kotlincloud.chap1.bean.HelloWorldBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/hello-world")
    fun helloWorld() : String = "Hello World"

    @GetMapping("/hello-world-bean")
    fun helloWorldBean() : HelloWorldBean = HelloWorldBean("Hello World")

    @GetMapping("/hello-world-bean/path-variable/{name}")
    fun helloWorldBeanPathVariable(@PathVariable name:String) : HelloWorldBean = HelloWorldBean("Hello World, $name")
}