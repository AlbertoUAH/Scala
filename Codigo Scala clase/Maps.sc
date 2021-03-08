val m = Map("a" -> 1, "b" -> 2)
val m1 = Map(("a", 1), ("b", 2), (1, "a"))

m + ("c" -> 3)
m("a")
// m("c")
/*
d = {"a": 1}
d["b"]

d.get("b") -> None
 */

m.get("a")
m.get("c")
m.getOrElse("c", 0)

/*
d.get("b") -> None
d.get("c", 0)
*/

m.foreach(println)

// List / Arrays

var num = new Array[Int](10)
val num_2 = Array(1, 2, 3, 4, 5)
num_2.foreach(println)

var result = for (n <- num_2) yield 2*n

num_2.map(_*2)

m.map(_._2*2)
/*
val v = (1, 2)
val v_1 = v._1
val v_2 = v._2
 */

// def media(a: Array[Double]): Double = ???
// val v = (1, 2)




// m.map(_._1 -> _._2*2)
var a = 0
num_2.foreach(a+=_)
a / num_2.length








