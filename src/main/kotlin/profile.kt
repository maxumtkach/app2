class Profile(

    val name: String,
    val surname: String,
    val id: Long = 1,
    val login: String = "max",
    var status: String = "activ",
    var avatar: String = "avatar",
    fullname: String = ""
) {

    var fullname: String = fullname
        get() = "Имя : $name\nФамилия : $surname"
}