def sum(f: Int => Int, m: Int, n: Int): Int =
  if (m > n) 0 else f(m) + sum(f, m + 1, n)

// currying
def sum2(f: Int => Int): (Int, Int) => Int = {
  def sumFunction(m: Int, n: Int): Int =
    if (m > n) 0 else f(m) + sumFunction(m + 1, n)
  sumFunction
}

// short version
def sum3(f: Int => Int)(m: Int, n: Int): Int =
  if (m > n) 0 else f(m) + sum3(f)(m + 1, n)

sum(x => x, 2, 3)
sum(x => x * x, 2, 3)

sum2(x => x)(2, 3)
sum2(x => x * x)(2, 3)

sum3(x => x)(2, 3)
sum3(x => x * x)(2, 3)

// tail-recursive version
def sum4(f: Int => Int)(m: Int, n: Int): Int = {
  def reduce(acc: Int, m: Int, n: Int): Int =
    if (m > n) acc else reduce(acc + f(m), m + 1, n)
  reduce(0, m, n)
}

sum4(x => x)(2, 3)
sum4(x => x * x)(2, 3)


