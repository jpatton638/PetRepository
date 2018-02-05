package App

import scala.collection.mutable.ArrayBuffer

/**
  * Created by john on 05/02/18.
  */
object PetRepository extends App {

  object Pets = new ArrayBuffer[Pet]()

  def other(): List[Pet] = Nil
  def add(pet: Pet): List[Pet]
  def removeByName(name: String): List[Pet]
  def update(pet: Pet): List[Pet]
}
