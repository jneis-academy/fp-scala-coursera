val xs = List(1, 2, 3)

xs.head
xs.tail
xs.length

xs take 2
xs drop 2

xs ++ xs
xs ::: xs

def last[T](xs: List[T]): T = xs match {
  case Nil => throw new NoSuchElementException
  case x::Nil => x
  case x::xs => last(xs)
}

last(xs)

def init[T](xs: List[T]): List[T] = xs match {
  case Nil => throw new NoSuchElementException
  case x::Nil => Nil
  case x::xs => x::init(xs)
}

init(xs)

def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case Nil => ys
  case x::xs => x::concat(xs, ys)
}

concat(xs, xs)

def reverse[T](xs: List[T]): List[T] = xs match {
  case Nil => Nil
  case x::xs => reverse(xs) ++ List(x)
}

reverse(xs)

def removeAt[T](xs: List[T], n: Int): List[T] = {
  if (n < 0 || n >= xs.length) xs
  else xs match {
    case Nil => Nil
    case x::xs => if (n == 0) xs else x::removeAt(xs, n - 1)
  }
}

removeAt(xs, -1)
removeAt(xs, 0)
removeAt(xs, 1)
removeAt(xs, 2)
removeAt(xs, 3)



