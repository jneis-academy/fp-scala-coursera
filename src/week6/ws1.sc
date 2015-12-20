val vec = Vector(1, 2, 3)
0 +: vec
vec :+ 4

val arr = Array(1, 2, 3)
arr map (x => 2*x)

val str = "123"
str filter (x => x%2 != 0)

val range1 = 1 until 5
val range2 = 1 to 5
val range3 = 5 to 1 by -2

range1 exists (x => x%2 == 0)
range3 forall (x => x%2 != 0)

val zipped = range3 zip str
zipped.unzip

def isPrime(n: Int): Boolean =
  (2 until n) forall (x => n % x != 0)

(1 to 10) zip ((1 to 10) map (x => isPrime(x)))