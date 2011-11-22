package fcx.codestory

object FooBarQix2 extends App {

  /*
  * norm retourne la chaine s si i est egal a 0, retourne une chaine vide sinon
  */
  def norm(s: String, i: Int): String = s * (1 / (1 + i.abs))

    def convert(i: Int): String = {
    var s = norm("Foo", i % 3) // i est divible par 3
    s += norm("Bar", i % 5) // i est divible par 5
    s += norm("Qix", i % 7) // i est divible par 7
    s += norm("Foo", (i / 10 - 3) % 10) // i commence par 3
    s += norm("Bar", (i / 10 - 5) % 10) // i commence par 5
    s += norm("Qix", (i / 10 - 7) % 10) // i commence par 7
    s += norm("Foo", (i - 3) % 10) // i se termine par 3
    s += norm("Bar", (i - 5) % 10) // i se termine par 5
    s += norm("Qix", (i - 7) % 10) // i se termine par 7
    norm(i.toString(), s.size) + s // si s.size = 0 on retourne i, s sinon   
  }

  for (i <- 1 to 100) {
    Console.println(convert(i))
  }
}
