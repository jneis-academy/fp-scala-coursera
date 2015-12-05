trait Expr {
  def isNumber: scala.Boolean
  def isSum: scala.Boolean
  def value: Int
  def left: Expr
  def right: Expr
}

class Number(val value: Int) extends Expr {
  def isNumber = true
  def isSum = false
  def left = throw new NoSuchFieldError
  def right = throw new NoSuchFieldError
}

class Sum(val left: Expr, val right: Expr) extends Expr {
  def isNumber = false
  def isSum = true
  def value = throw new NoSuchFieldError
}

def eval(e: Expr): Int = {
  if (e.isNumber) e.value
  else if (e.isSum) eval(e.left) + eval(e.right)
  else throw new UnsupportedOperationException
}

val one = new Number(1)

eval(one)
eval(new Sum(one, one))
