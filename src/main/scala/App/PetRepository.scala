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
    println(filtered.toList)
    filtered.toList
  }
  def add(pet: Pet*): List[Pet] = {
    pet.map(p => pets += p)
    println(pets.toList)
    pets.toList
  }

  def removeByName(name: String): List[Pet] = {
    val filtered = pets.filter(p => p.name == name)
    println(filtered.toList)
    filtered.toList
  }
  def update(pet: Pet): List[Pet] = {
    val petsList = pets.toList
      petsList.map(p =>
      if (p.name == pet.name) {
        pets -= p
        pets += pet
      }
    )
    println(pets.toList)
    pets.toList
  }

  val pet1 = Pet("Harry")
  val pet2 = Pet("James")
  val pet3 = Dog("Bogdan")
  val pet4 = Cat("Lawrence")
  val pet5 = Pet("Matty")

  add(pet1, pet2, pet3, pet4, pet5)
  other()
  removeByName("Bogdan")
  update(pet2)
}


