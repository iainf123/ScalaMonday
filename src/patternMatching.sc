def patternMatching (A : Int, B : Int, Bool : Boolean) : Unit = {

     match {
        case true => println(A+B)
        case false => println(A*B)
        case _ =>  println("neither")

    }
}

patternMatching(4,6, Bool = true)
patternMatching(1,2, Bool = false)