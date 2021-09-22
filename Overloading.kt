class Overloading{
    fun overloading(num1:Int,num2:Int)
    {
        var sum:Int  = num1+num2
        println("addition of two integer $sum")

    }

    fun overloading(num1:Double,num2:Double)
    {
        var sum:Double  = num1+num2
        println("addition of two double $sum")

    }

    fun overloading(num1:Int,num2:Int,num3:Int)
    {
        var multiply:Int = num1*num2*num3
        println("addition of three multiply $multiply")
    }

    fun overloading(s1:String,s2:String)
    {
        var concate = s1+""+s2
        println("concatenation of two STring $concate")
    }
    fun overloading(s1:String,s2:String,s3:String)
    {
        var concate = s1+" "+s2+" "+s3
        println("concatenation of three STring $concate")
    }

}


