class Rational(num: Int, den: Int) {
    require(den > 0, "denominator must be different than zero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  // by-value (once eval each)
  val numerator = num / gcd(num, den)
  val denominator = den / gcd(num, den)

  override def toString = numerator + "/" + denominator

  def less(that: Rational) =
    numerator * that.denominator < that.numerator * denominator

  def max(that: Rational) = if (less(that)) that else this
}

val x = new Rational(1, 2)
val y = new Rational(3, 2)

x.less(y)
y.less(x)
x.max(y)

new Rational(0)
new Rational(0, 1)
new Rational(1, 0)


