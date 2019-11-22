class ViewGroup(str: String) : View(str) {

     fun addView (view: View) {

        println("View $view")
    }
}