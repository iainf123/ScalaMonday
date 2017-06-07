def patternMatching1b(A: Int, B: Int) : Unit = {
    (A,B) match {
        case (0, 0) => println(0)
        case (0,_) => println(B)
        case (_, 0) => println(A)

    }
}

patternMatching1b(0,10)