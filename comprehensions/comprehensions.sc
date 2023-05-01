case class Transformer(name: String, movie: String)

val autoBots = List(
  Transformer("Optimus Prime", "Transformers (2007)"),
  Transformer("Bumblebee", "Transformers (2007)"),
  Transformer("Jetfire", "Transformers: Revenge of the Fallen (2009)"),
  Transformer("Wheelie", "Transformers: Revenge of the Fallen (2009)"),
  Transformer("Sentinel Prime", "Transformers: Dark of the Moon (2011)"),
  Transformer("Brains", "Transformers: Dark of the Moon (2011)"),
)

val autoBotsInTransformers2007Movie = for (autoBot <- autoBots if autoBot.movie == "Transformers (2007)") yield autoBot.name
println("-----------------------------------------------------------------------------------")
println("Autobots who first appeared in the Transformers (2007) movie:")
autoBotsInTransformers2007Movie.foreach(autoBot => println(s"=> $autoBot"))


val autoBotsInTransformersRevengeOfTheFallen2009Movie = for (autoBot <- autoBots if autoBot.movie == "Transformers: Revenge of the Fallen (2009)") yield autoBot.name

println("-----------------------------------------------------------------------------------")
println("Autobots who first appeared in the Transformers: Revenge of the Fallen (2009) movie:")
autoBotsInTransformersRevengeOfTheFallen2009Movie.foreach(autoBot => println(s"=> $autoBot"))
println("-----------------------------------------------------------------------------------")

val autoBotsInTransformersDarkOfTheMoon2011Movie = for (autoBot <- autoBots if autoBot.movie == "Transformers: Dark of the Moon (2011)") yield autoBot.name

println("Autobots who first appeared in the Transformers: Dark of the Moon (2011):")
autoBotsInTransformersDarkOfTheMoon2011Movie.foreach(autoBot => println(s"=> $autoBot"))
println("-----------------------------------------------------------------------------------")