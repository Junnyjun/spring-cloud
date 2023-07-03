package git.io.apiboard

import org.springframework.stereotype.Service

@Service
class BoardRepository {

    fun find() = Board(1, "Board")
    data class Board(val id: Int, val name: String)
}