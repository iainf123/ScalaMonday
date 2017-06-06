def conditionals2 (A : Int, B : Int) : Unit = {
    if (A == 0 && B == 0)
        return 0
    if (A == 0 && B != 0)
        return B
    if (A != 0 && B == 0)
        return A
}


conditionals2(0,10)