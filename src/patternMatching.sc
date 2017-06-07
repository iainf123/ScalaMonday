def patternMatching (A : Int, B : Int, Bool : Boolean) : Unit = {

     Bool match {
        case true => println(A+B)
        case false => println(A*B)


    }
}

patternMatching(4,6, true)
patternMatching(1,2, false)