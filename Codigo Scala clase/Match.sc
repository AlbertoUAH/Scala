def matchTest(x: Int): String = x match {
  case 0 => {
    val zero = "cero"
    zero.toUpperCase()
  }
  case 1 => "uno"
  case 2 => "dos"
  case _ => "otro"
}


def alfabeto(letra: Char) = letra match {
  case 'a' | 'A' => "Alpha"
  case 'b' | 'B' => "Beta"
  case _ => "caracter invalido"
}

def max(x: Int, y: Int) = x > y match {
  case true => x
  case false => y
}

val v = ("a", 1, 3)
val (a, b, c) = v

