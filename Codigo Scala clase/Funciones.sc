// Iterativa - For
def fac(n:Int) = {
  var r = 1
  for(i <- 1 to n)
    r = r * i
  r
}

fac(5)

// Recursiva
def factorial(n: Int): Int = if(n<=0) 1 else n * factorial(n-1)
factorial(5)


def printName(nombre: String = "sin nombre",
              apellido: String = "sin apellido"): Unit = {
  println(f"$nombre $apellido")
}

printName("charles", "flores")
printName("charles")

printName(apellido="flores")



// nombre = charles
// apellido = flores
// print(f"{nombre} {apellido}")

// factorial(3) -> 3 * (2 * (1 * 1))
// factorial(2) -> 2 * (1 * 1)
// factorial(1) -> 1 * 1
// factorial(0) -> 1
/*
def fac(n:Int) = {
  r = 1
  for i in range(n+1):
    r = r * i
  return r
}

 */
