// Tuplas
val v = (1, 2, "true", true)
val v_1 = v._1
val v_2 = v._2
v._3
v._4

val (a, b, c, d) = v

def divide10(n: Int): (Int, Int) = {
  (n/10, n%10)
}
/*
def divide10(n: Int): {
  return n/10, n%10
}*/

val (decenas, unidades) = divide10(9)

// Seq

val mySeq = Seq(9,8,7,6)
val mySeq_1 = mySeq:+1

mySeq++Seq(6,5,4,3)

for (i <- mySeq) {
  println(i)
}

// (Int) => Unit
mySeq.foreach(println)

var acc = 0
mySeq.foreach(acc+=_)
println(acc)

// Set

val mySet = Set(1,2,2,3,4,5,5)

// -1, -2, 1, 2, 3, 4, 0, 0
// 1, 2, 3, 4, 0, 0, -1, -2
val Seq1 = Seq(0, 0, 1, -2, 3, -1, 2, 4, 0, 0)
Seq1.filter(_>=0)++Seq1.filter(_<0)


def reorder(col: Seq[Int]): Seq[Int] = {
  val positivos = col.filter(_ > 0)
  val negativos = col.filter(_ < 0)
  val zeros = col.filter(_ == 0)
  positivos ++ zeros ++ negativos
}