def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
  case (Nil, ys) => ys
  case (xs, Nil) => xs
  case (x::xss, y::yss) => if (x < y) x::merge(xss, ys) else y::merge(xs, yss)
}

def mergeSort(xs: List[Int]): List[Int] = {
  val n = xs.length / 2

  if (n == 0)
    xs
  else {
    val (fst, snd) = xs splitAt n
    merge(mergeSort(fst), mergeSort(snd))
  }
}

mergeSort(List(4, 1, 9, 3, 6, 1, 2, 8, 5, 7, 9, 1))