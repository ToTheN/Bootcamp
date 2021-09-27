fun main(args: Array<String>) {

    Singleton.print("sdfghjj")

println("---------------------------------------------------")
    println("Question 2 Answer 2")
    val obj1 = A()
    val obj2 = B()
    val obj3 = C()
    obj1.show("$obj1")

    obj2.show("$obj2")
    obj3.show("$obj3")


println("---------------------------------------------------")
println("Question 3 Answer 3")


    "movies".add("movies")
    val number1 = 20
    number1.arithmetic(67)
}

fun String.add(s:String)
{
    val s1 = "we love to see animated"
    println("original string is $this")
        for(items in s.indices)
        {
            println(this[items])
        }

    println("The sentence we can use for this is $s1 $this")
}
fun Int.arithmetic(number1:Int)
{
    println("addition of two no is ${this+number1}")
    println("subtraction of two no is ${this-number1}")
    println("product od two no is ${this*number1}")


}