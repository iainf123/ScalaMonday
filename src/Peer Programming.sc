import scala.collection.mutable.{ArrayBuffer, ListBuffer}

def check(minWeight: Int, maxTemp : Int, inputArrayBuffer: ArrayBuffer[(Int,Int)]): String = {
    var answer: String = ""


    for (x <- 0 to inputArrayBuffer.size - 1) {

        (inputArrayBuffer(x)._1 >= minWeight) && (inputArrayBuffer(x)._2 <= maxTemp) match
            {
            case true => answer += (x + 1).toString + ", "
            case false =>
        }
    }


    var finalAnswer = ("The following seats are suitable for Goldilocks: " + answer)
    finalAnswer.substring(0, finalAnswer.length - 2)

}



var inputList = scala.collection.mutable.ArrayBuffer.empty[(Int,Int)]

inputList += ((30,50))
inputList += ((130,75))
inputList += ((90,60))
inputList += ((150,85))
inputList += ((120,70))
inputList += ((200,200))
inputList += ((110,100))

check(100, 80, inputList)