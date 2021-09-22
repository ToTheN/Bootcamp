class grade {

    fun percentTograde( marks:Int)
    {
        if(marks in 50..60)
        {
            println("Good")
        }
        if(marks in 61..70)
        {
            println("Very Good")
        }
        if(marks in 71..80)
        {
            println("Excellent")
        }
        if(marks in 81..100)
        {
            println("Rockstar")
        }

    }
}