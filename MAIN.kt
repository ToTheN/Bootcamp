fun main(args:Array<String>)
{
    println("QUESTION 1 ANSWER 1")
    var t  = detail(Firstname = "tushar", lastName = "saini", age = 22)
    println(detail.Firstname)
    println(detail.lastName)
    println(detail.age)
println("-------------------------------------------------------------------------------------")
    println("QUESTION 2 ANSWER 2")
    var o = Overloading()
    println(o.overloading(1,2))
    println(o.overloading(1.1,3.0))
    println(o.overloading(1,2,3))
    println(o.overloading("hello","world"))
    println(o.overloading("hello","world","everyone"))
println("-------------------------------------------------------------------------------------")
    println("QUESTION 3 ANSWER 3")
    var d = Icici()
    d.getDetails()

println("-------------------------------------------------------------------------------------")
    println("QUESTION 5 ANSWER 5")
  var g = grade()
    g.percentTograde(70)

println("-------------------------------------------------------------------------------------")
    println("QUESTION 6 ANSWER 6")
    var h = MutableList()
    h.mut()
println("-------------------------------------------------------------------------------------")
    println("QUESTION 7 ANSWER 7")

    val mp = mapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")
    println(mp)
    println(mp.keys)
    println(mp.values)
println("-------------------------------------------------------------------------------------")
    println("QUESTION 8 ANSWER 8")

    val hash = hashSetOf<String>("a","b","c","d","e")
    println(hash)
}


