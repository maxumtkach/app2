fun main() {
    val ithem = Profile("max", "tkach")
    ithem.fullname
    println(ithem.fullname)
    println("-----------------------------------------------")
    val view1 = View("")
    view1.click("View")
    println("-----------------------------------------------")
    val text = TextView("Some Text")
    text.click("TextView") // вызывается метод из `View`
    // println(text.text) // Some Text
    //text.text = "Something bad happened"
    //println(text.text) // Something bad happened
  println("-----------------------------------------------")
  val button = Button("Click me")
  button.click("button") // вызывается метод из `View`
  //println(button.text) // Click me
  //button.text = "Don't click me"
 // println(button.text) // Don't click me
  println("-----------------------------------------------")

  val main = ViewGroup("")
  val title = TextView("Main Screen")
  main.addView(title)

  val content = ViewGroup("")
  val readMore = Button("Read more")
  content.addView(readMore)
}