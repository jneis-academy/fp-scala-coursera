import week3.{Empty, NonEmpty}

val set = new NonEmpty(5, Empty, Empty)

set.contains(1)
set.contains(5)

set.incl(1).contains(1)

set.incl(1).incl(8).incl(7).incl(6).incl(9)

Empty.union(set)
set.union(Empty)

val set2 = new NonEmpty(3, Empty, Empty)

set2.incl(2).incl(4).incl(1).union(set.incl(1))
set.incl(1).union(set2.incl(2).incl(4).incl(1))
