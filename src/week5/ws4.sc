val xs = List(1, 2, 3)

def scale(xs: List[Int], factor: Int): List[Int] = xs match {
  case Nil => Nil
  case y::ys => y * factor :: scale(ys, factor)
}

scale(xs, 2)

def map[T, U](xs: List[T], f: T => U): List[U] = xs match {
  case Nil => Nil
  case y::ys => f(y) :: map(ys, f)
}

map(xs, (x: Int) => x*2)
xs map (x => x*2)

def filter[T](xs: List[T], p: T => Boolean): List[T] = xs match {
  case Nil => Nil
  case y::ys => if (p(y)) y::filter(ys, p) else filter(ys, p)
}

filter(xs, (x: Int) => x%2 == 1)
xs filter (x => x%2 == 1)

xs partition (x => x%2 == 1)
xs takeWhile (x => x%2 == 1)
xs dropWhile (x => x%2 == 1)
xs span (x => x%2 == 1)