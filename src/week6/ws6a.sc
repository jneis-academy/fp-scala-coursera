val countries = Map(
  "US" -> "Washington",
  "Switzerland" -> "Bern"
)

// throws NoSuchElementException
countries("US")

// returns an Option obj
countries get "Andorra"

// or with default values
(countries withDefaultValue "Unknown")("Andorra")

val fruits = List("pear", "orange", "pineapple", "apple")

// order-by op
fruits sorted

fruits sortWith (_.length < _.length)

// group-by op
fruits groupBy (_.head) mkString ", "
