class detail(Firstname:String , lastName:String, age:Int) {

    init {
        println("his name is $Firstname")

    }
    init {
        println("his lastname is $lastName")
    }

    init {
        println("his age is $age")
    }

    companion object
    {
        const val Firstname = "her firstname is sadfi"
        const val lastName = "her last name is sharma"
        const val age = "her age is "+ 22
    }
}