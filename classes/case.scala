case class Person(firstName: String, lastName: String)

val person1 = Person("Optimus", "Prime")
val person2 = Person("Optimus", "Prime")
val person3 = Person("Sam", "Witwicky")

println(if(person1 == person2) s"$person1 & $person2 are the same person" else s"$person1 & $person2 are NOT the same person")
println(if(person1 == person3) s"$person1 & $person3 are the same person" else s"$person1 & $person3 are NOT the same person")


