class MutableList {

    fun mut(){
        val mylist = arrayListOf<Int>(1,2,3,4,5,6,7,8)
        println("list before edition $mylist")

        mylist.remove(2)
        mylist.add(1,10)
        println("list after edition $mylist")

    }

}