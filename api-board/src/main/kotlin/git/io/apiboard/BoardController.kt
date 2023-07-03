package git.io.apiboard

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class BoardController(
    private val boardRepository: BoardRepository
) {

    @RequestMapping("/find")
    fun find() = boardRepository.find()

}