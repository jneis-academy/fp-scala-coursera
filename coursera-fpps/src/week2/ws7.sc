class Rational(num: Int, den: Int) {
  require(den > 0, "denominator must be different than zero")

  def numerator = num
  def denominator = den

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def toString = {
    val g = gcd(numerator, denominator)
    var n = numerator / g
    val d = denominator / g
    if (d == 1) n + "" else n + "/" + d
  }

  def + (that: Rational) =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  // unary operator
  def unary_- = {
    new Rational(-numerator, denominator)
  }

  def - (that: Rational) = this + (-that)

  def < (that: Rational) =
    numerator * that.denominator < that.numerator * denominator

  def max(that: Rational) = if (this < that) that else this
}

val x = new Rational(1, 2)
val y = new Rational(3, 2)

// infix notation
x max y
y - x


