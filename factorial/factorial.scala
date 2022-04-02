object Factorial {
    def factorial (n: Long): Long = {
        @annotation.tailrec
        def loop(n: Long, acc: Long): Long = 
            if (n <= 0) acc
            else loop(n - 1, n * acc)
        loop(n,1)
    }
    
    def main(args: Array[String]): Unit = {
        
        if (args.length <= 0) 
            return println("Usage: scala factorial/factorial.scala 5 (or any other valid integer)")
        
        if(args(0).toLongOption == None) 
            return println(s"factorial/factorial.scala: ${args(0)} is not a valid integer")
            
        println(s"Factorial of ${args(0)} is ${factorial(args(0).toLong)}")
    } 
}