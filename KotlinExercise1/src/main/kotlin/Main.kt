import java.util.*

fun main(args: Array<String>) {
    println("QUESTION 1 ANSWER 1")

    var sentence:String = "hello my name is tushar sharma"
    val oldword = "sharma"
    val newWord = "saini"

    val correct:String = sentence.replace(oldword,newWord)
    println(correct)

    println("-----------------------------------------------------")
    println("QUESTION 2ANSWER 2")

    val word = WordRepition()
    word.repitition()


    println("-----------------------------------------------------")
    println("QUESTION 3ANSWER 3")

    var countchar = CountcharWithoutLoop()
    countchar.count()

    println("-----------------------------------------------------")
    println("QUESTION 4ANSWER 4")

    val percent = percentage()
    percent.calculate()


    println("-----------------------------------------------------")
    println("QUESTION 5 ANSWER 5")

    val num = arrayOf<Int>(1,2,3,4)
    val num2 = arrayOf<Int>(4,2,6,9)

    for (i in num.indices) {
        for (j in num2.indices) {
            if (num[i] == num2[j]) {
                println(" common elements are ${num[i]}")
            }
        }
    }


    println("-----------------------------------------------------")
    println("QUESTION 6 ANSWER 6")

    val pair = Pair()
    pair.checkpair()













}