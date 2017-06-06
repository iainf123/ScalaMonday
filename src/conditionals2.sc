def conditionals2 (A : Int, B : Int) : Unit = {
    if (A == 0 && B == 0)
        return 0
    else if (A == 0 && B != 0)
        return B
    else if (A != 0 && B == 0)
        return A

}


conditionals2(0,10)