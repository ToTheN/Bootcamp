import java.util.stream.IntStream.range

class List {

    fun cal()
    {
        val e1 = Employee("anirudh saini",33)
        val e2 = Employee("tushar saini",22)

        val e3 = Employee("aisha saini",36)

        val e4 = Employee("mandodari saini",30)

        val list = arrayListOf<Employee>(e1,e2,e3,e4)
        val found = (list.filter {
            it -> it.age > 30
        })

        println(found)
    }



}


