val empty = List()
val one = List(1)
val ints = List(1, 2, 3)

val ints2 = 1::(2::(3::Nil))
val ints3 = 1::2::3::Nil
val empty2 = Nil

ints.head
ints.tail
ints.isEmpty

def matchList[T](l: List[T]): String = l match {
  case Nil => ""
  case o::Nil => o.toString
  case h::t => h.toString + ", " + matchList(t)
}

matchList(empty)
matchList(one)
matchList(ints)

def matchList2[T](l: List[T]): String = l match {
  case List() => ""
  case List(o) => o.toString
  case h::t => h.toString + ", " + matchList2(t)
}

matchList2(empty)
matchList2(one)
matchList2(ints)

def reverse(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case y::ys => insert(y, reverse(ys))
}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case Nil => x::Nil
  case y::ys => if (x < y) y::insert(x, ys) else x::xs
}

reverse(empty)
reverse(one)
reverse(ints)