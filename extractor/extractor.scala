import scala.util.matching.Regex

object StudentId {
    def apply(name: String, rollNumber: Int) = s"$name,$rollNumber"

    def unapply(studentId: String): Option[(String, Int)] = {
        val arr = studentId.split(",")
        if (arr.length == 2)
            Some(arr(0), arr(1).toInt) 
        else
            None
    }
}

object Main {
    def main(args: Array[String]): Unit = {
        
        if(args.length < 2) {
            return println("Usage: scala extractor/extractor.scala <Student Name>, <Student Roll No>")
        }

        if( nameContainsSpecialCharacters(args(0)) || nameContainsNumber(args(0)) ) {
            return println("<Student Name> must not contain any numbers or special characters")
        }

        if(args(1).toIntOption == None) {
            return println("<Student Roll No> must be a valid number (for ex: 1001)")
        }
        
        val studentId = StudentId(args(0),args(1).toInt)
        
        val (name, rollNumber) = studentId match {
            case StudentId(name, rollNumber) => {
                (name, rollNumber.toInt)
            }
        }

        println("Student's")
        println(s"=> Name: $name")
        println(s"=> Roll No: $rollNumber")
    }

    def nameContainsSpecialCharacters(name: String): Boolean = {
        val nonAlpahabets = new Regex("[^A-Za-z ]") findAllIn name
        nonAlpahabets.hasNext
    }

    def nameContainsNumber(name: String): Boolean = {
        val numbers = new Regex("[0-9]") findAllIn name
        numbers.hasNext
    }
}