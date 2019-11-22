import java.lang.reflect.Array.get

class Profile(

    val name: String,
    val surname: String,
    val id: Long = 1,
    val login: String = "max",
    var status: String = "activ",
    var avatar: String = "avatar"
) {

    val fullname: String = "Имя : $name\nФамилия : $surname"
}