class Rational(num: Int, den: Int) {
  def numerator = num
  def denominator = den

  override def toString = numerator + "/" + denominator

  def add(that: Rational) =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  def neg = {
    new Rational(-numerator, denominator)
  }

  def sub(that: Rational) = add(that.neg)
}

val x = new Rational(1, 3)
val y = new Rational(1, 2)
val z = new Rational(3, 2)

x.numerator
x.denominator

x.add(y)
y.add(z)

x.neg

z.sub(y)
y.add(z).sub(x)


