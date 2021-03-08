
object AnalisisExploratorio extends Analizador {

  val dataset = Utilidades.readFile(fichero = "src/adult.data.clean.csv")
  
  def redondear(num: Double, orden: Int): Double = (math floor num * orden) / orden
  
  // Implementa la función
  // ejercicio-1:
  // Número total de registros en el dataset.
  def totalDeRegistros(c: Seq[Contribuyente]): Int = c.length
  
  // Implementa la función
  // ejercicio-2:
  // Calcular la media de edad de todos los contribuyentes
  def calculaEdadMedia(c: Seq[Contribuyente]): Double = redondear(c.foldLeft(0.0)(_+_.age) / c.length, 100)

  // Implementa la función
  // ejercicio-3:
  // Calcular la media de edad de todos los contribuyentes sin contar aquellos cuya edad sea 0
  def calculaEdadMediaNoZeros(c: Seq[Contribuyente]): Double = {
    val contribuyentes_no_ceros = c.filter(_.age != 0)
    redondear(contribuyentes_no_ceros.foldLeft(0.0)(_+_.age) / contribuyentes_no_ceros.length, 100)
  }

  // Implementa la función
  // ejercicio-4:
  // Descubrir de cuántos países distintos provienen los contribuyentes
  def paisesOrigenUnicos(c: Seq[Contribuyente]): Seq[String] = {
    c.map(contrib => if (contrib.nativeCountry.trim.isEmpty) "null" else contrib.nativeCountry).toSet.toSeq
  }

  // Implementa la función
  // ejercicio-5:
  // De todos los contribuyentes, ¿cómo se distribuye por género?. Devuelve el porcentaje de hombres
  // y el de mujeres en ese orden, (porcentajeDeHombres, porcentajeDeMujeres)
  def distribucionPorGeneros(c: Seq[Contribuyente]): (Double, Double) = {
    val porcentajeDeHombres = redondear((c.filter(_.sex == "Male").length * 100.0 / c.length), 100)
    val porcentajeDeMujeres = redondear((c.filter(_.sex == "Female").length * 100.0 / c.length), 100)
    (porcentajeDeHombres, porcentajeDeMujeres)
  }

  // Implementa la función
  // ejercicio-6:
  // Cuál es el tipo de trabajo (workclass) cuyos ingresos son mayoritariamente superiores a ">50K
  def trabajoMejorRemunerado(c: Seq[Contribuyente]): String = {
    val porcentajeMejorRemunerado = c.groupBy(v => v.workclass).map(contrib => (contrib._1, 
                                    contrib._2.filter(_.income == ">50K").length * 100.0 / contrib._2.length)).toSeq
    
    porcentajeMejorRemunerado.sortBy(- _._2).toSeq(0)(0).toString()
  }
  
  // Implementa la función
  // ejercicio-7:
  // Cuál es la media de años de educación (education-num) de aquellos contribuyentes cuyo país de origen no es
  // United-States
  def aniosEstudiosMedio(c: Seq[Contribuyente]): Double = {
    val contribSinEEUU = c.filter(_.nativeCountry != "United-States")
    redondear(contribSinEEUU.foldLeft(0.0)(_+_.educationNum) / contribSinEEUU.length, 100)
  }

  //  println(s" -> Dataset tiene un total de registros: ${totalDeRegistros(c = dataset)}")
  //  println(s" -> En el dataset, los contribuyentes tienen una edad media: ${calculaEdadMedia(c = dataset)}")
  //  println(s" -> En el dataset, los contribuyentes tienen una edad media (sin contar aquellos con age = 0): ${calculaEdadMediaNoZeros(c = dataset)}")
  //  println(s" -> Los contribuyentes provienen de distintos países como: ${paisesOrigenUnicos(c = dataset).foreach(println)}")
  //  println(s" -> Los contribuyentes se distribuyen en (hombres - mujeres): ${distribucionPorGeneros(c = dataset)}")
  //  println(s" -> El tipo de trabajo mejor remunerado en el dataset es: ${trabajoMejorRemunerado(c = dataset)}")
  //  println(s" -> La media de años de estudio de los contribuyenes de origen distinto a United States es: ${aniosEstudiosMedio(c = dataset)}")
  //  ejercicio-11
  //  llama a la función impimeContribuyentes
  //  imprimeContribuyentes(c = dataset)
}
