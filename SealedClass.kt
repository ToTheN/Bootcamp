sealed class SealedClass {
    fun show(name:String) {
       println("subclass name is")
    }
}
    class A : SealedClass() {

    }


    class B : SealedClass() {
    }

    class C : SealedClass() {
    }

