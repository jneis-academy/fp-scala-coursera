def mergeSort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x::xss, y::yss) =>
        if (lt(x, y)) x::merge(xss, ys) else y::merge(xs, yss)
    }
    val (fst, snd) = xs splitAt n
    merge(mergeSort(fst)(lt), mergeSort(snd)(lt))
  }
}

mergeSort(List(-5, 6, 3, 2, 7))((x, y) => x < y)
mergeSort(List("apple", "pear", "orange"))((x, y) => x.compareTo(y) < 0)