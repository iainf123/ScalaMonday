def blackjack ( P1 : Int, P2 : Int) : Unit = {
    if (P1 == 21 && P2 == 21)
        return println(0)
    else if (P1 == 21 && P2 != 21)
        return println(21)
    else if (P1 != 21 && P2 == 21)
        return println(21)
    else if (P1 != 21 && P2 != 21 )
        return println(0)
}
blackjack(18,21)
blackjack(20,18)
blackjack(22,22)