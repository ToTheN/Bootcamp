class Pair {
  fun checkpair()
  {
      val str1 = "ajslkrisjdnvcmd"
      var a:Int=0
      var b:Int = 0
      var c:Int = 0
      var d:Int = 0
      var e = 0
      var f:Int = 0
      var g:Int = 0
      var h:Int = 0
      var i:Int = 0
      var j:Int  = 0
      var k:Int = 0
      var l:Int = 0
      var m:Int = 0
      var n:Int = 0
      var o:Int = 0
      var p:Int=0
      var q:Int = 0
      var r:Int = 0
      var s:Int= 0
      var t:Int = 0
      var u:Int = 0
      var v:Int  = 0
      var w:Int = 0
      var x:Int = 0
      var y:Int = 0
      var z:Int = 0







      var letter:String

      val arr = str1.toCharArray()

      for (I in 0 until arr.size)
      {
          for(J in I+1 until arr.size)
          {
              if(arr[I] == arr[J])
              {
                  letter = arr[J].toString()
                  when(letter){
                      "a" -> a += 1
                      "b" -> b += 1
                      "c" -> c += 1
                      "d" -> d += 1
                      "e" -> e += 1
                      "f" -> f += 1
                      "g" -> g += 1
                      "h" -> h += 1
                      "i" -> i += 1
                      "j" -> j += 1
                      "k" -> k += 1
                      "l" -> l += 1
                      "m" -> m += 1
                      "n" -> n += 1
                      "o" -> o += 1
                      "p" -> p += 1
                      "q" -> q += 1
                      "r" -> r += 1
                      "s" -> s += 1
                      "t" -> t += 1
                      "u" -> u += 1
                      "v" -> v += 1
                      "w" -> w += 1
                      "x" -> x += 1
                      "y" -> y += 1
                      "z" -> z += 1

                  }
              }
          }
      }
      if(a == 0)
      {
          println("letter is a")
      }
      if(b == 0)
      {
          println("letter is b")
      }
      if(c == 0)
      {
          println("letter is c")
      }
      if(d == 0)
      {
          println("letter is d")
      }
      if(e== 0)
      {
          println("letter is e")
      }
      if(f == 0)
      {
          println("letter is f")
      }
      if(g == 0)
      {
          println("letter is g")
      }
      if(h == 0)
      {
          println("letter is h")
      }
      if(e == 0)
      {
          println("letter is i")
      }
      if(j == 0)
      {
          println("letter is j")
      }
      if(k == 0)
      {
          println("letter is k")
      }
      if(l == 0)
      {
          println("letter is l")
      }
      if(m == 0)
      {
          println("letter is m")
      }
      if(n == 0)
      {
          println("letter is n")
      }
      if(o == 0)
      {
          println("letter is o")
      }
      if(p == 0)
      {
          println("letter is p")
      }
      if(q == 0)
      {
          println("letter is q")
      }
      if(r == 0)
      {
          println("letter is r")
      }
      if(s == 0)
      {
          println("letter is s")
      }
      if(t == 0)
      {
          println("letter is t")
      }
      if(u == 0)
      {
          println("letter is u")
      }
      if(v == 0)
      {
          println("letter is v")
      }

      if(w == 0)
      {
          println("letter is w")
      }
      if(x == 0)
      {
          println("letter is x")
      }
      if(y == 0)
      {
          println("letter is y")
      }
      if(z == 0)
      {
          println("letter is z")
      }





  }




}