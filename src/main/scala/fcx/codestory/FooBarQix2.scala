package fcx.codestory

object FooBarQix2 extends App {

  foobarqix(100)

  def rpl = List("", "", "", "Foo", "", "Bar", "", "Qix", "", "", "")
  /*
  * norm retourne la chaine s si i est egal a 0, retourne une chaine vide sinon
  */
  def norm(s: String, i: Int): String = s * (1 / (1 + i.abs))

  def convert(i: Int): String = {
    var s = ""
    for (nb <- 1 to 9)
      s += norm(rpl(nb), i % nb) // i est divible par n
    for (exp <- math.log10(i).toInt to 0 by -1)
      for (nb <- 1 to 9)
        s += norm(rpl(nb), ((i / ((math.pow(10, exp)).toInt)) - nb) % 10) // i contient nb en exp ème position
    norm(i.toString(), s.size) + s // si s.size = 0 on retourne i, s sinon
  }

  def foobarqix(max: Int) {
    for (i <- 1 to max)
      Console.println(convert(i))
  }

}
