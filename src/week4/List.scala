package week4

trait List[T] {
  def isEmpty: scala.Boolean
  def head: T
  def tail: List[T]
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException
  def tail: Nothing = throw new NoSuchElementException
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

object List {
  def apply[T](): List[T] = new Nil
  def apply[T](x1: T): List[T] = new Cons(x1, new Nil)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
}
