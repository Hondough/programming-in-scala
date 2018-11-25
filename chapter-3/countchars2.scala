import scala.io.Source

def widthOfLine(s: String) = s.length.toString.length

if (args.length > 0) {

  val lines = Source.fromFile(args(0)).getLines().toList

  val longestLine = lines.reduceLeft(
    (l, r) => if (l.length > r.length) l else r
  )
  val maxWidth = widthOfLine(longestLine)

  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLine(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}
else
  Console.err.println("Please enter filename")