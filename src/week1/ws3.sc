def square(x: Double) = x * x

square(2)

def sumOfSquares(x: Double, y: Double) =
  square(x) + square(y)

sumOfSquares(2, 3)

// => lazy (by-name)
def first(x: Int, y: => Int) = x

def loop: Int = loop

first(1, loop)