class Super {}
class SubA extends Super {}
class SubB extends Super {}

val a: Array[SubA] = Array(new SubA)

// doesn't compile 'cause Arrays are invariant
// val s: Array[Super] = a
// s(0) = new SubB
// val b = s(0)

val aa: List[SubA] = List(new SubA)

// compiles 'cause Lists are covariant (& immutable)
val ss: List[Super] = aa

// covariant types can only appear in method params
// contravariant types can only appear in method results
// invariant types can appear anywhere
trait Function[-P, +R] {
  def apply(x: P): R
}

// covariant lists
class List2[+T] {
  // doesn't compile 'cause List2 is declared as covariant
  // def prepend(x: T): List2[T] = new List2[T]

  // compiles, using type bounds
  def prepend[S >: T](x: S): List2[S] = new List2[S]
}

val aaa: List2[SubA] = new List2
val sss: List2[Super] = aaa
val sss2 = sss.prepend(new SubB)




