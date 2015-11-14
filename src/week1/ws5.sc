def abs(x: Double) =
  if (x > 0) x else -x

def sqrt(x: Double): Double = {

  def iter(guess: Double, x: Double): Double =
    if (approximates(guess, x)) guess
    else iter(improve(guess, x), x)

  def approximates(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  iter(1.0, x)
}

sqrt(4)
sqrt(900)
sqrt(0.0025)

sqrt(0.001)
sqrt(0.1e-20)
sqrt(0.1e20)