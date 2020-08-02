fun main (args:Array<String>) {
  val d = Drumkit (true,true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()
}