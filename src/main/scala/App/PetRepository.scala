package App

/**
  * Created by john on 05/02/18.
  */
object PetRepository extends App {

  class Pet (name : String)

  def all() : List[Pet] = Nil
  def findByName(name : String) : Option[Pet] = None
  def dogs() : List[Pet] = Nil
  def cats() : List[Pet] = Nil
}
