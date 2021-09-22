class Icici : Boi(){

    override fun getDetails(){
        var branchName:String = "icici"
        var rointerest:Int = 4
         super<Boi>.getDetails()

        println("branchName =  $branchName")
        println("rointerest = $rointerest")
    }
}