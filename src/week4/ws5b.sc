trait Expr

class Number(val value: Int) extends Expr

class Sum(val left: Expr, val right: Expr) extends Expr

def eval(e: Expr): Int = {
  if (e.isInstanceOf[Number])
    e.asInstanceOf[Number].value
  else if (e.isInstanceOf[Sum])
    eval(e.asInstanceOf[Sum].left) + eval(e.asInstanceOf[Sum].right)
  else throw new UnsupportedOperationException
}

val two = new Number(2)

eval(two)
eval(new Sum(two, two))