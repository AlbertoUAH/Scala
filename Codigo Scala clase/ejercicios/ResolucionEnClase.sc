// Definir una función cuya firma es: countDown(n: Int): Unit. Esta función
// imprimirá los números de n a 0
def countDown(n: Int): Unit = { for (i <- n to 0 by -1) println(i) }
countDown(5)


// Definir una función recursiva que imprima un string que reciba por parámetro al revés
def alReves(n: String): Unit = {
  if(n.length>0) {
    println(n(n.length-1))
    alReves(n.dropRight(1))
  }
}
alReves("hola")


// Definir una función que reciba un array como argumento y devuelva un
// array nuevo sin duplicados
def sinDuplicados(a: Array[Int]): Array[Int] = {
  a.toSet.toArray
}

val ar1 = Array(1,2,3,2,4,2,3,5)
sinDuplicados(ar1)


// Definir una funcion que reciba un parámetro de tipo Map[String, Int] y devuelva un
// mapa con las mismas claves pero los valores incrementados en 100
def incrementar(m: Map[String, Int]): Map[String, Int] = {
  // m.map(kv => (kv._1, kv._2+100))
  m.map{ case (k, v) => (k, v + 100)}
}

val m = Map(("a", 12), ("b", 24), ("c", 45), ("d", 98))
incrementar(m)


// - Definir una función que devuelva '1' si el entero
//que recibe como parámetro está entre 0 y 9, '2' si
//está entre 10 y 19, '3' si está entre 20 y 29 y '0' si
//no está en ninguno de estos rangos.
def enRangos(x: Int): Char = x match {
  case a if 0 until 10 contains a => '1'
  case a if 10 until 20 contains a => '2'
  case a if 20 until 30 contains a => '3'
  case _ => '0'
}

enRangos(8)
enRangos(9)
enRangos(25)
enRangos(50)

// Definir una función que tome un parámetro de tipo Any y devuelva un Boolean con valor a true
// si el argumento de entrada es un String vacio o 0
def isTrue(a: Any): Boolean = a match {
  case "" | 0 => false
  case _ => true
}

isTrue("")
isTrue(0)
isTrue(1)
isTrue("false")



// Define una clase: Contador que tenga una propiedad:
// valor y dos funciones:
// incrementar: Unit y actual: Int.
// Incrementar suma 1 a la propiedad valor y actual
// devuelve el valor
class Contador(var n: Int = 0) {
  def incrementar(): Unit = n += 1
  def actual(): Int = n
}

val c = new Contador()
c.incrementar()
c.incrementar()
c.incrementar()
c.incrementar()
c.actual()
c.n


// Define una clase: Persona cuyo constructor acepte
//2 parámeteros, nombre: String y edad: Int y una
//función imprime: Unit, que use la función println
//para escribir un mensaje por consola mostrando los
//valores de nombre y edad en el siguiente formato:
//"Mi nombre es $nombre y tengo $edad"

class Persona(n: String, e: Int) {
  def imprime(): Unit = println(s"mi nombre es $n y tengo $e")
}

// - Define un objeto Conversiones que tenga métodos:
//  - pulgadasACentimetros(p: Double): Double,
//  - galonesALitros(g: Double): Double y
//  - millasAKilometros(m: Double): Double
// que calcule las conversiones de unidades.


object Conversiones {
  def pulgadasACentimetros(p: Double): Double = {
    val factor = 2.5
    p*factor
  }
  def galonesALitros(g: Double): Double = {
    val factor = 9.0
    g*factor
  }
  def millasAKilometros(m: Double): Double = {
    val factor = 2.0
    m*factor
  }
}

//
Conversiones.galonesALitros(10)
Conversiones.millasAKilometros(5)
Conversiones.pulgadasACentimetros(6)


// Repetimos el ejercicio anterior, pero con un efoque más Orientado a Objetos, para
// ello se puede hacer definiendo un `abstract class` o usando un `trait`: ConversorUnidades con una función
// abstracta convertir(d: Double): Double. Ahora creamos un objeto para cada
// función del ejercicio5: PulgadasACentimetros, GalonesALitros y
// MillasAKilometros, los tres deben extender ConversorUnidades e implementar
// la función convertir.

trait Conversor {
  val factor: Double
  def conversion(a: Int) = a * factor
}

object PulgadasACentimetros extends Conversor {
  override val factor: Double = 2.5
}


object GalonesALitros extends Conversor {
  override val factor: Double = 0.4
}

object MillasAKilometros extends Conversor {
  override val factor: Double = 2.3
}


PulgadasACentimetros.conversion(10)

// Dada una colección de libros, define una función que devuelva
// todos los libros que empiezan por
// isbn: "1%"

case class Libro(isbn: String, nombre: String)

// 100001
// 200001
// 100002
// 200003
// 200002
// 100003

val libros = Seq(
  Libro("100001", "a"),
  Libro("200001", "b"),
  Libro("100002", "c"),
  Libro("200003", "d"),
  Libro("200002", "e"),
  Libro("100003", "f")
)

libros.filter(_.isbn.startsWith("1"))








