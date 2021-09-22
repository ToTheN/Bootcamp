open class Boi : Sbi() {

    override fun getDetails(){
        var branchName:String = "boi"
        var rointerest:Int = 6
        super<Sbi>.getDetails()
        println("branchName =  $branchName")
        println("rointerest = $rointerest")
    }
}