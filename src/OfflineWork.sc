def doubleChar( A : String , B: String, C: Char, D: Char  ) : String = {
    val string : String = A + B

    string.replace()
}
doubleChar("THHEE",3,4)
println(doubleChar)


def getSandwhich (string: String) : Unit = {
      match = {
        case a if "breadjambread" => "Jam"
        case b if "xxbreadjambreadyy" => "Jam"
        case c if "xxbreadyy " => " "
    }
}

getSandwhich("jam")
println(getSandwhich)

// i want to case match the letter formation to read the letters in sequence and if they match the letters i am looking for
 //then use that as a way of recognising what it should do for example disregarding the single bread as a bad choice i think i need to use the
 //contains function?


def evenlySpaced( num1 : Int, num2: Int, num3: Int, bool : Boolean) : Unit = {

    bool: false
        if (num1 || num2 || num3 == /2){
        println(true)
} else {false
    }
}

evenlySpaced(2, 4, 6)
evenlySpaced(4, 6, 2)
evenlySpaced(4, 6, 3)
// the idea is to check if all three numbers can be divided by 2, if so the output can be classed as true, if not then it is
// false

// task 5, the idea would be to take in the given int of bunnys and know that each rabbit had two ears which would be initialised
// 2 rabbits would equal 4 ears, this would then double for each rabbit in turn, so would take in a given number of rabbits
// would double the output? for this i would want to use a map that knows the pairs?

def nTwice ( A : String , N: Int ) : Unit = {
    println( A.substring {
        N - 1
    })
}
nTwice("Hello", 2)
nTwice("Chocolate", 3)
nTwice("Chocolate", 1)

// not entirely sure on how to get it to remove more than the first few letters, i think i need to use replace?

def endsLy (string: String, boolean: Boolean) = {
    if endsLy(endsWith "ly")
    return true
} else false

endsLy("oddly", true)
endsLy("y", false)
endsLy("oddy", false)

// the string takes in the value endsLy then checks if the word endsWith "ly" if it does then it will return the boolean
//value of true, if it doesnt end with the value it the value then it should return false





