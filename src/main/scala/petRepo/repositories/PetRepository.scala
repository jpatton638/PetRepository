package petRepo.repositories

import petRepo.Pet

import scala.collection.mutable.ArrayBuffer

/**
  * Created by digital032676 on 05/02/18.
  */
object PetRepository {

  

  private val _pets : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all() : List[Pet] = _pets.toList

  def findByName(name: String) : Option[Pet] = _pets.find(p => p.name == name)


  def dogs : List[Dog] = {
    _pets.toList.flatMap { case d @ Dog(_, _) => Some(d)
    case _ => None
    }
  }

  def cats : List[Cat] = {
    _pets.toList.flatMap { case c @ Cat(_, _) => Some(c)
    case _ => None
    }
  }

  def other() : List[Pet] = _pets.toList


}