import scala.io.Source

object Add {
  def getDigits = {
    var source = Source.fromFile("./Problem11.txt")
    val lines = source.getLines
    val digits =  lines.map{x => x.toInt}
    source.close
    digits
  }

  def main(): String = {
   getDigits.foldLeft(0)((x,y) => x + y).toString.take(10)
  }
}
