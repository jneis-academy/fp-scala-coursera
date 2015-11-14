// tail-recursive
def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)

gcd(14, 21)

// not tail-recursive
def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)

factorial(0)
factorial(1)
factorial(3)
factorial(5)

def tailFactorial(n: Int): Int = {

  def iter(acc: Int, n: Int): Int =
    if (n == 0) acc else iter(acc * n, n - 1)

  iter(1, n)
}

tailFactorial(0)
tailFactorial(1)
tailFactorial(3)
tailFactorial(5)