object Earth {
  private var population = 100000

  def currentPopulation(): Int = {
    population += 10
    population
  }
}

println(s"Earth's current population: ${Earth.currentPopulation()}")
println(s"Earth's population now stands at: ${Earth.currentPopulation()}")