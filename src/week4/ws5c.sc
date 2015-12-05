trait Expr {
  def eval: Int
}

class Number(val value: Int) extends Expr {
  def eval: Int = value
}

class Sum(val left: Expr, val right: Expr) extends Expr {
  def eval: Int = left.eval + right.eval
}

val three = new Number(3)

three.eval
new Sum(three, three).eval