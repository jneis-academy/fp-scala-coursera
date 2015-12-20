def mergeSort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x::xss, y::yss) =>
        if (ord.lt(x, y)) x::merge(xss, ys) else y::merge(xs, yss)
    }
    val (fst, snd) = xs splitAt n
    merge(mergeSort(fst), mergeSort(snd))
  }
}

mergeSort(List(-5, 6, 3, 2, 7))
mergeSort(List("apple", "pear", "orange"))