def uniqueSum (Num1: Int, Num2: Int, Num3: Int) : Unit = {

    if (Num1 == Num2 && Num1 == Num3)
        return println(0)

    else if (Num1 != Num2 && Num2 != Num3)
        return println(Num1 + Num2 + Num3)

    else if (Num1 == Num2 && Num1 == Num3 && Num2 == Num3)
        return println(Num2 + Num3)
}
uniqueSum(1,2,3)
uniqueSum(3,3,3)
uniqueSum(1,1,2)