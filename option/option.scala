trait MyOption[+A] {
    def filter(f : A => Boolean): Option[A]
}

case class IntOption(private val value: Int) extends MyOption[Int] {
    override def filter(f: Int => Boolean) = if( f(value) ) Some(value) else None
}

object Main {
    def main(args: Array[String]): Unit = {

        if(args.length < 0)
            return println("Usage: scala option/option.scala 50 (or any other valid integer)")

        if(args(0).toIntOption == None) 
            return println(s"option/option.scala: ${args(0)} is not a valid integer")

        val userInput = IntOption(args(0).toInt).filter(_ > 40)

        if(userInput == None) 
            return println("Oops! Looks like you flunked the exam!")

        return println("Congratulations! You passed the exam.")
    }
}