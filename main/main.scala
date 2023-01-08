object Main {
  def main(args: Array[String]): Unit =
    if (args.length > 0)
      println(s"Command-line argument passed to main(): ${args(0)}")
    else
      println("No command-line arguments were passed to main()")
}
