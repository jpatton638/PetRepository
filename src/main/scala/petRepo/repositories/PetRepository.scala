package petRepo.repositories

import petRepo.Pet

import scala.collection.mutable.ArrayBuffer

/**
  * Created by digital032676 on 05/02/18.
  */
object PetRepository {

  private val _pets : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all() : List[Pet] = _pets.toList

  def findByName(name: String) : Option[Pet] = {
    //    val filtered = _pets.filterNot(p => p.name == name)
    //    filtered.headOption
    _pets.find(p => p.name == name)
  }

  def dogs() : List[Pet] = _pets.toList

  def cats() : List[Pet] = _pets.toList

  def other() : List[Pet] = _pets.toList

  def add(pet : Pet*) : List[Pet] = {
    //  _pets.++=(pet)
    pet.foreach(p => _pets.+=(p))
    all
  }

  def removeByName(name : String) : List[Pet] = {
    // find the pet you want to remove by name
    // remove that pet from _pets list
    // reassign the _pets with the new filtered list
    // _pets = filtered
    // return the new list with all()
    _pets.toList
  }

  def update(pet: Pet) : List[Pet] = {
    // find the index of the pet is it at position 1, 2 or 3 for example?
    // call _pets.update(index, pet)
    // all()
    _pets.toList
  }

}