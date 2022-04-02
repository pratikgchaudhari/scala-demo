object Fibonacci {
    def fibo(n: Long): Long = {
        def loop(n:Long): Long = {
            if (n <= 0) 0
            else
                if (n == 1 || n == 2) 1
                else
                    loop(n - 1) + loop(n - 2)
        }
        loop(n - 1)
    }

    def main(args: Array[String]): Unit = {
        
        if (args.length <= 0) 
            return println("Usage: scala fibonacci/fibonacci.scala 5 (or any other valid integer)")
        
        if(args(0).toLongOption == None) 
            return println(s"fibonacci/fibonacci.scala: ${args(0)} is not a valid integer")
            
        println(s"${args(0)}th Fibonacci number is ${fibo(args(0).toLong)}")
    }
}