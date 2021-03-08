/*
for x in range(1, 11):
  print(x)
 */
// for: to
for (x <- 1 to 10) {
  println(x)
}

// for: until
for (x <- 1 until 10) {
  println(x)
}

var word = "Monday"
for(x <- 0 until word.length) { println(word(x))}

// while
var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

x = 10
do {
  println(x)
  x -= 1
} while (x >= 0)


// for con incrementos de 2 en 2
for (x <- 1 to 10 by 2) {
  println(x)
}
// for decremental
for (x <- 10 to 1 by -1) {
  println(x)
}