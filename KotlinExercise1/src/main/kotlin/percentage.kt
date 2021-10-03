class percentage {
    var sentence:String = "TusharSAI@#$%Ni5628"
    val size = sentence.length
    var lower = 0
    var Upper = 0
    var dig = 0
    var spl = 0
    var i:Int = 0
   fun calculate()
   {
       for(i in sentence.indices)
       {
           if((sentence[i] >= 'a') and (sentence[i] <= 'z') )
           {
               lower += 1
           }
           else if( (sentence[i] >= 'A') and (sentence[i] <= 'Z'))
           {
               Upper += 1
           }
           else if((sentence[i] >= '0' ) and (sentence[i] <= '9'))
           {
               dig += 1
           }
           else if((sentence[i] == '@') or (sentence[i] == '#')or (sentence[i] == '$') or (sentence[i] == '%')
           or (sentence[i] == '^') or (sentence[i] == '&') or  (sentence[i] == '*'))
           {
               spl +=1
           }
           else{
               println("nothing is in text")
           }

       }


       println("no of lower case character is $lower and % is ${(lower.toDouble()/19)*100} ")
       println("no of upper case  character is $Upper and % is ${(Upper.toDouble()/19)*100}")
       println("no of digit character is $dig and % is ${(dig.toDouble()/19)*100}")
       println("no of special character is $spl and % is ${(dig.toDouble()/19)*100} ")

   }

}