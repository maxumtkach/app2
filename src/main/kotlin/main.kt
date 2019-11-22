import java.awt.SystemColor.text

fun main() {
    val ithem = Profile("max", "tkach")
    ithem.fullname
    println(ithem.fullname)
    println("-----------------------------------------------")
    val text1 = TextView("Some Text")
    text1.click("click") // вызывается метод из `View`
    println(text1.str) // Some Text
    println("-----------------------------------------------")

    val text2 = TextView("Some Text")
    text2.click("")
    println("-----------------------------------------------")
    val text = TextView("Some Text")
    text.click("") // вызывается метод из `View`
    println("-----------------------------------------------")
    val button = Button("button")
    button.click("button") // вызывается метод из `View`

    println("-----------------------------------------------")

    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}