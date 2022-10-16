package git.junny.kotlincloud.chap1.user

import java.time.LocalDate

class UserService(
    val users : List<User>
) {
    // static int count to kotlin
    companion object {
        var count = 0
    }
    init{
        users.plus(User(1, "junny", LocalDate.now()))
        users.plus(User(2, "junny2", LocalDate.now()))
    }

    fun findAll() : List<User> = users
    fun findOne(id: Int) : User = users.find { it.id == id } ?: throw IllegalArgumentException("User not found")
}