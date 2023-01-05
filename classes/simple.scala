class Person(firstName: String, lastName: String) {
  override def toString: String = s"Hello, I'm $firstName $lastName."
}

val person = new Person("Optimus", "Prime")

println(person)