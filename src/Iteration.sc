def iteration (A : String, B : Int) : Unit = {

    for (i <- 1 to B) {
        println(A)
    }

}
iteration("hi",3)