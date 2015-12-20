val xs = List(1, 2, 3)

def sum(x: Int, y: Int) = x + y
def lin(x: Int, y: Int) = x + y * 2
def concat(x: Int, y: Int) = ("" + x + y).toInt

xs reduceLeft sum
xs reduceLeft lin // (1 + 2*2) + 3*2

xs reduceRight sum
xs reduceRight lin // 1 + (2 + 3*2)*2

(xs foldLeft 0)(sum)
(xs foldLeft 0)(concat)

(xs foldRight 0)(sum)
(xs foldRight 0)(concat)