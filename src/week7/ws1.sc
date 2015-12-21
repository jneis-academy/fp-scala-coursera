def isPrime(n: Int): Boolean =
  (2 until n) forall (x => n % x != 0)

// constructs all prime numbers in the range
// = performance problem
((1000 to 10000) filter isPrime)(1)

// lazy evaluation of tail
((1000 to 10000).toStream filter isPrime)(1)

// stream construction
val stream = Stream.cons(3, Stream.empty)

1 #:: Stream.cons(2, stream)

// infinite streams
def from(n: Int): Stream[Int] = n #:: from(n+1)

(from(0) take 10).toList
