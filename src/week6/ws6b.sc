class Poly(val terms: Map[Int, Int]) {

  override def toString =
    (for {
      (e, c) <- terms.toList.sorted.reverse
    } yield c + "x^" + e) mkString " + "

  def + (other: Poly) = new Poly(terms ++ other.terms)
  def ++ (other: Poly) = new Poly(terms ++ (other.terms map adjust))

  def adjust(term: (Int, Int)): (Int, Int) = {
    val (e, c) = term
    terms get e match {
      case Some(y) => e -> (c + y)
      case None => e -> c
    }
  }
}

object Poly {
  def apply(terms: (Int,Int)*): Poly = new Poly(terms toMap)
}

val p1 = Poly(3 -> 4, 1 -> 2, 5 -> 6)
val p2 = Poly(0 -> 3, 3 -> 7)

p1 + p2
p1 ++ p2
