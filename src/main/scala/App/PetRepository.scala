package App

import scala.collection.mutable.ArrayBuffer

/**
  * Created by john on 05/02/18.
  */
object PetRepository extends App {
  
  case class Pet (name : String)
  case class Dog(override val name: String) extends Pet(name)
  case class Cat(override val name: String) extends Pet(name)

  private val pets = new ArrayBuffer[Pet]()

  // Andy
  def all() : List[Pet] = Nil
  def findByName(name : String) : Option[Pet] = None
  def dogs() : List[Dog] = Nil
  def cats() : List[Cat] = Nil

  // John
  def other(): List[Pet] = {
    val filtered = pets.filter(p => p.isInstanceOf[Pet])
    filtered.toList
  }
  def add(pet: Pet*): List[Pet] = {
    pet.map(p => pets += p)
    pets.toList
  }

  def removeByName(name: String): List[Pet] = {
    val filtered = pets.filter(p => p.name == name)
    filtered.toList
  }
  def update(pet: Pet): List[Pet] = {
    ???
  }
}


