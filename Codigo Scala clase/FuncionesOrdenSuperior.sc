val double = (i: Int) => i * 2
def ordenSuperior(x: Int, y: Int => Int) = y(x)

ordenSuperior(10, double)

val triple = (i: Int) => i * 3

ordenSuperior(3, triple)

