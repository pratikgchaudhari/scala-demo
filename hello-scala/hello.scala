object HelloScala {
    def hello(name:String):String = 
        s"Hello, $name"
    
    def main(args: Array[String]): Unit =
        if (args.length != 1)
            println("Usage: scala hello.scala \"Your First Name\"")
        else 
            println(hello(args(0)))
}