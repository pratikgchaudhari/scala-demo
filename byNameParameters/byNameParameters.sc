import scala.annotation.tailrec

@tailrec def until(condition: => Boolean)(body: => Unit): Unit = {
  if (condition) {
    body
    until(condition)(body)
  }
}

var counter = 1

until(counter <= 10) {
  println(s"Counter is currently at $counter")
  counter += 1
}

