def cube(x: Int) = x * x * x
cube(2)
cube(3)

def factorial(x: Int): Int =
  if (x == 0) 1 else x * factorial(x - 1)
factorial(2)
factorial(3)

def sumInts(m: Int, n: Int): Int =
  if (m > n) 0 else m + sumInts(m + 1, n)

def sumCubes(m: Int, n: Int): Int =
  if (m > n) 0 else cube(m) + sumCubes(m + 1, n)

def sumFactorials(m: Int, n: Int): Int =
  if (m > n) 0 else factorial(m) + sumFactorials(m + 1, n)

sumInts(2, 3)
sumCubes(2, 3)
sumFactorials(2, 3)

def sum(f: Int => Int, m: Int, n: Int): Int =
  if (m > n) 0 else f(m) + sum(f, m + 1, n)

sum(x => x, 2, 3)
sum(x => cube(x), 2, 3)
sum(x => factorial(x), 2, 3)

def product(f: Int => Int, m: Int, n:Int): Int =
  if (m > n) 1 else f(m) * product(f, m + 1, n)

product(x => x, 2, 3)

def newFactorial(x: Int) = product(x => x, 1, x)

factorial(0)
factorial(1)
factorial(3)
factorial(5)

newFactorial(0)
newFactorial(1)
newFactorial(3)
newFactorial(5)
