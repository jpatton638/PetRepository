package App

import scala.collection.mutable.ArrayBuffer

/**
  * Created by john on 05/02/18.
  */
object PetRepository extends App {

  trait Pet {
    val name: String
  }

  case class Dog(override val name: String) extends Pet
  case class Cat(override val name: String) extends Pet
  case class Hamster(override val name: String) extends Pet

  private val _pets = new ArrayBuffer[Pet]()

  // Andy
  def all() : List[Pet] = {
    println(s"All: ${_pets.toList}")
    _pets.toList
  }

  def findByName(name: String) : Option[Pet] = {
    val found = _pets.find(p => p.name equals name)
    println(s"Find By Name: $found")
    found
  }

  def dogs : List[Dog] = {

    val dogBuffer = new ArrayBuffer[Dog]()

    _pets.toList.map {
      case d @ Dog(_) => dogBuffer += d
      case _ => null
    }
    println(s"Dogs: ${dogBuffer.toList}")
    dogBuffer.toList
  }

  def cats : List[Cat] = {

    val catBuffer = new ArrayBuffer[Cat]()

    _pets.toList.map {
      case c @ Cat(_) => catBuffer += c
      case _ => null
    }
    println(s"Cats: ${catBuffer.toList}")
    catBuffer.toList
  }

  def other() : List[Pet] = {

    val otherBuffer = new ArrayBuffer[Pet]()

    _pets.toList.map {
      case _: Dog => null
      case _: Cat => null
      case o @ _ => otherBuffer += o
    }
    println(s"Other Pets: ${otherBuffer.toList}")
    otherBuffer.toList
  }

  def add(pet: Pet*): List[Pet] = {
    pet.map(p => _pets += p)
    println(s"Add: ${_pets.toList}")
    _pets.toList
  }

  def removeByName(name: String): List[Pet] = {
    val filtered = _pets.toList.filterNot(p => p.name equals name)
    println(s"Removed: $filtered")
    filtered
  }

  def update(pet: Pet): List[Pet] = {
    _pets.toList.map(p =>
      if (p == pet) {
        _pets -= p
        _pets += pet
      }
    )
    println(s"Updated: ${_pets.toList}")
    _pets.toList
  }

}


