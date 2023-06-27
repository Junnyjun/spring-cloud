package git.io.apiuser

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userRepository: UserRepository
) {

        @RequestMapping("/find")
        fun find() = userRepository.find()
}