package App

import petRepo.Pet

import scala.collection.mutable.ArrayBuffer

/**
  * Created by john on 05/02/18.
  */
object PetRepository extends App {

  trait Pet
  case class Dog(name: String) extends Pet
  case class Cat(name: String) extends Pet

  private val _pets = new ArrayBuffer[Pet]()

  // Andy
  def all() : List[Pet] = {
    println(_pets.toList)
    _pets.toList
  }

  def findByName(name: String) : Option[Pet] = _pets.find(p => Some(name).contains(name))


  def dogs : List[Dog] = {
    _pets.toList.flatMap { case d @ Dog( _) =>
      println(Some(d))
      Some(d)
    case _ =>
      println("No Dogs Found")
      None
    }
  }

  def cats : List[Cat] = {
    _pets.toList.flatMap { case c @ Cat(_) =>
      println(Some(c))
      Some(c)
    case _ =>
      println("No Cats Found")
      None
    }
  }

  def other() : List[Pet] = {
    println(_pets.toList)
    _pets.toList
  }

  // John
//  def other(): List[Pet] = {
//    val filtered = _pets.filter(p => p.isInstanceOf[Pet])
//    println(filtered.toList)
//    filtered.toList
//  }

  def add(pet: Pet*): List[Pet] = {
    pet.map(p => _pets += p)
    println(_pets.toList)
    _pets.toList
  }

  def removeByName(name: String): List[Pet] = {
    val filtered = _pets.filter(p => Some(name).contains(name))
    println(filtered.toList)
    filtered.toList
  }
  def update(pet: Pet): List[Pet] = {
    val petsList = _pets.toList
      petsList.map(p =>
      if (p == pet) {
        _pets -= p
        _pets += pet
      }
    )
    println(_pets.toList)
    _pets.toList
  }

  val pet1 = Dog("Harry")
  val pet2 = Cat("James")
  val pet3 = Dog("Bogdan")
  val pet4 = Dog("Lawrence")
  val pet5 = Cat("Matty")

  add(pet1, pet2, pet3, pet4, pet5) // Done
  all() // Done
  findByName("James") // todo
  dogs // todo
  cats // todo
  other() // todo
  removeByName("Bogdan") // todo
  update(pet2) // Done
}


