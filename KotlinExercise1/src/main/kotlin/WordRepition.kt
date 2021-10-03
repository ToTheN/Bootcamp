class WordRepition {
   fun repitition()
    {
        var str = "did you do did this"
        str = str.toLowerCase()
        var count = 0
        lateinit  var word:String
        val words = str.split(" ")
        val len = words.size

        print("Duplicate words in a given string : ")

        for(i in 0 until len)
        {
            for (j in i+1 until len)
            {
                if(words[i] == words[j])
                {
                    count += 1
                    word = words[i].toString()

                }

            }
        }

        println("$count and string is $word")


    }


}
