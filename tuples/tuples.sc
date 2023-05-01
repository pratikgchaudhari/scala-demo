val autoBots = List(
  ("Optimus Prime", 2007),
  ("Bumblebee", 2007),
  ("Jetfire", 2009),
  ("Wheelie", 2009),
  ("Sentinel Prime", 2011),
  ("Brains", 2011)
)

val autoBotsInTransformers2007Movie = for ((autoBotName, movieYear) <- autoBots if movieYear == 2007) yield autoBotName
println("-----------------------------------------------------------------------------------")
println("Autobots who first appeared in the Transformers (2007) movie:")
autoBotsInTransformers2007Movie.foreach(autoBot => println(s"=> $autoBot"))

val autoBotsInTransformers2009Movie = for ((autoBotName, movieYear) <- autoBots if movieYear == 2009) yield autoBotName
println("-----------------------------------------------------------------------------------")
println("Autobots who first appeared in the Transformers (2009) movie:")
autoBotsInTransformers2009Movie.foreach(autoBot => println(s"=> $autoBot"))

val autoBotsInTransformers2011Movie = for ((autoBotName, movieYear) <- autoBots if movieYear == 2011) yield autoBotName
println("-----------------------------------------------------------------------------------")
println("Autobots who first appeared in the Transformers (2011) movie:")
autoBotsInTransformers2011Movie.foreach(autoBot => println(s"=> $autoBot"))