package petRepo

import petRepo.repositories.PetRepository

object PetRepo extends App {

  val pets = PetRepository.all
  println(pets)

  val dogs = for(i <- 1 to 100) yield new Dog(s"Dog $i")

  PetRepository.add(dogs: _*)

  PetRepository.findByName("lassie") // Some(Dog("lassie"))

  val p2 = PetRepository.all
  println(p2)

  case class Dog(name: String) extends Pet

}
