package week3

class Nil[T] extends List[T] {

  def isEmpty = true

  def head: Nothing = throw new NoSuchElementException

  def tail: Nothing = throw new NoSuchElementException

}
