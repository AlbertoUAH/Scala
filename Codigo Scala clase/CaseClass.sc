class Alumno(n: String, a: String)
class AlumnoDefecto(n: String = "sin nombre",
                    a: String = "sin apellido")

val a = new Alumno("charles", "flores")
val b = new AlumnoDefecto(n="pepito")

case class AlumnoCaseClass(
                            n: String,
                            a: String
                          )
val case_a = AlumnoCaseClass("pepito", "lopez")
case_a.n
case_a.a

object Termometro {
  def tempratura() = 0
}

Termometro.tempratura()

trait TraitAlumno {
  val nombre: String

  def diNombre() = println(nombre)
}

class AlumnoTrait(val nombre: String) extends TraitAlumno {
}
