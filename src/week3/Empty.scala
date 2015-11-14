package week3

object Empty extends IntSet {

  override def toString = "."

  def contains(x: Int) = false

  def incl(x: Int): IntSet =
    new NonEmpty(x, Empty, Empty)

  def union(other: IntSet) = other

}
