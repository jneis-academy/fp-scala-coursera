package week4

abstract class Boolean {
  def && (that: Boolean): Boolean
  def || (that: Boolean): Boolean
  def unary_!(): Boolean
  def == (that: Boolean) = that
  def != (that: Boolean) = that.unary_!()
}

object True extends Boolean {
  def && (that: Boolean) = that
  def || (that: Boolean) = this
  def unary_!() = False

  override def toString() = "true"
}

object False extends Boolean {
  def && (that: Boolean) = this
  def || (that: Boolean) = that
  def unary_!() = True
  override def toString() = "false"
}
