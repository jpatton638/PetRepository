package petRepo

/**
  * Created by digital032676 on 05/02/18.
  */
trait Pet {
  val name : String
}

class Dog(override val name : String) extends Pet