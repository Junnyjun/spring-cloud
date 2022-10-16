package git.junny.kotlincloud.chap1.user

import java.time.LocalDate

class User(
    val id: Int,
    // name over than 2

    val name: String,
    val date: LocalDate
) {
    //javax.validation.constraints.Past to kotlin

}