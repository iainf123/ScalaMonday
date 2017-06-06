def strings2 ( A : String , B: String, C: Char, D: Char  ) : String = {
   val string : String = A + B

    string.replace(C, D)
}
strings2("ha", "llo", 'a', 'e')