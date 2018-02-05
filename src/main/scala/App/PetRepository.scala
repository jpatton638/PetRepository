package App

import scala.collection.mutable.ArrayBuffer

/**
  * Created by john on 05/02/18.
  */
object PetRepository extends App {
  
  class Pet (name : String)
  private val pets = new ArrayBuffer[Pet]()

  def all() : List[Pet] = Nil
  def findByName(name : String) : Option[Pet] = None
  def dogs() : List[Pet] = Nil
  def cats() : List[Pet] = Nil
  def other(): List[Pet] = Nil
  def add(pet: Pet): List[Pet] = Nil
  def removeByName(name: String): List[Pet] = Nil
  def update(pet: Pet): List[Pet] = Nil
}


