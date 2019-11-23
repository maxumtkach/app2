class ViewGroup() : View() {

    var view: String = ""

    fun addView(view: View) {
        this.view = view.toString()
    }
}