def iterations3 (A : String,B : String, C: Int) : Unit = {

        for (i <- 0 to C){
            if (i % 3 == 0 && i % 5 == 0)
                println("fizzBuzz")
            if (i % 3 == 0)
                println("fizz")
            if (i % 5 ==0)
                println("Buzz")
            else
                println("")
        }
}
iterations3("fizz", "Buzz", 15)