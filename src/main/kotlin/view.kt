open class View(val str: String) {

    open fun click(message: String) {

        println("View clicked  :  $message")
    }
}