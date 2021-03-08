// Usos de `var` y `val`

val a = 10
val b = "Hola Mundo"

val l = Seq(10, 20, "a", 1.20)
val l1 = Seq(10, 20)

var x = 1 + 2 * 3.5


def addOne(x: Int) = x + 1
def function_condition(x: Int) = if (x > 0) 1 else "negativo"

var x = 10
val y = 10

x = 11
// x = "hola mundo"
// y = "hola"

val a = 3 // 0011
val b = 9 // 1001

x & y // 0001
x | y
x ^ y
a << 2 // 1100

var lista = 1::2::3::4::Nil
var lista_segunda = List(1,2,3,4)