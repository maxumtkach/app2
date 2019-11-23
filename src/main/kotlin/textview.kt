open class TextView(val str: String) : View() {

    override fun click(message: String) {
        println(" str = $str")
    }
}