// traverse multiple collections (combinatorial search)
(1 to 3) map (x => (1 to 2) map (y => (x, y)))
// concat elements from all subvectors
((1 to 3) map (x => (1 to 2) map (y => (x, y)))).flatten
// equivalent to
(1 to 3) flatMap (x => (1 to 2) map (y => (x, y)))

// for expressions
for {
  i <- 1 to 3
  j <- 1 to 2
} yield (i, j)

