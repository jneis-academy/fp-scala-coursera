def expr = {

  def x = {
    print("x") // runs every call
    1
  }

  lazy val y = {
    print("y") // runs only at 1st call
    2
  }

  val z = {
    print("z") // runs only at declaration
    3
  }

  x + y + z + x + y + z
}

expr
