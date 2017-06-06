def iterations3 (A : String,B : String, C: Int) : Unit = {

        for (i <- 1 to C){
            if (i % 3 == 0 && i % 5 == 0)
                println("fizzBuzz")
            else  if (i % 3 == 0)
                println("Fizz")
            else if (i % 5 == 0)
                println("Buzz")
            else
                println(i)

        }
}
iterations3("fizz", "Buzz", 15)