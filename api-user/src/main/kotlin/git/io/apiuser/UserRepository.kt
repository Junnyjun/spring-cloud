package git.io.apiuser

import org.springframework.stereotype.Repository

@Repository
class UserRepository {

    fun find() = User(1, "John Doe")
    data class User(val id: Int, val name: String)
}