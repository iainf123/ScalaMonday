def Strings ( A : String , B: Int ) : Unit = {
   println( A.substring {
      B - 1
   })
}

Strings("hello", 3)