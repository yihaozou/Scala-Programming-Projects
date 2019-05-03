import scala.collection.breakOut
val map: Map[String, Int] = Vector("hello", "world").map(s => s -> s.length)(breakOut)
map.foreach(b => println(b._1,b._2))

val set:Set[String] = map.keySet
println(set)
