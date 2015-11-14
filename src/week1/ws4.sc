def abs(x: Int) = if (x > 0) x else -x

abs(1)
abs(-1)
abs(0)

val x = abs(2)
def y = abs(3) // lazy (by-name)

def loop: Boolean = loop
def z = loop
def and(x: Boolean, y: => Boolean) =
  if (x) y else false

def or(x: Boolean, y: => Boolean) =
  if (x) true else y

and(true, true)
and(true, false)
and(false, loop)

or(true, loop)
or(false, true)
or(false, false)

