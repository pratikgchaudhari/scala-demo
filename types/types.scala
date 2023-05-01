case class Person(firstName: String, lastName: String)

val list = List(
  "\"This is a string\"",
  1001,
  3.14159265359,
  'c',
  false,
  Person("Optimus", "Prime"),
  (),
  () => "This is an anonymous function"
)

def typeOf[T](v: T) = v match {
  case _: String => println(s"$v is of type String")
  case _: Int => println(s"$v is of type Int")
  case _: Double => println(s"$v is of type Double")
  case _: Char => println(s"$v is of type Char")
  case _: Boolean => println(s"$v is of type Boolean")
  case _: Person => println(s"$v is of type Person")
  case _: Unit => println(s"$v is of type Unit")
  case _ => println(s"Unable to determine the type of $v")
}

list.foreach(item => typeOf(item))