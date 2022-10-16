package git.io.kotlinclient

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController(private val environment: Environment) {
    // 현재 서버 profile 정보를 가져오는 API


    @GetMapping("/test")
    fun test()  : String  = environment.activeProfiles.toString()

}