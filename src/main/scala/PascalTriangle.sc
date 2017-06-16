def tri(row:Int):List[Int] = {
    row match { case 1 => List(1)
    case n:Int => List(1) ::: ((tri(n-1)
        zip tri(n-1).tail)

        map {case (a,b) => a+b}) ::: List(1) }} //> tri: (row: Int)List[Int]

tri(1) //> res1: List[Int] = List(1)
tri(2) //> res2: List[Int] = List(1, 1)
tri(3) //> res3: List[Int] = List(1, 2, 1)
tri(4) //> res4: List[Int] = List(1, 3, 3, 1)
tri(5) //> res5: List[Int] = List(1, 4, 6, 4, 1)

def pascalTri(n:Int) =
    (1 to n) foreach {i=>print(" "*(n-i))
        tri(i) map (c=>print(c+" "))
        println} //> prettytri: (n: Int)Unit

pascalTri(5)
//> 1
//| 1 1
//| 1 2 1
//| 1 3 3 1
//| 1 4 6 4 1








def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], open: Int): Boolean =
        if (chars.isEmpty) open == 0
        else if (chars.head == '(') balanced(chars.tail,open+1)
        else if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
        else balanced(chars.tail,open)
    balanced(chars,0)

}
