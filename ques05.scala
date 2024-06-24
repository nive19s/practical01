object TotalRunningTime {
  def main(args: Array[String]): Unit = {
    val easyPace = 8  
    val tempoPace = 7 
    val easyPaceDistance = 4 
    val tempoDistance = 3
    val totalTime = (easyPaceDistance * easyPace) + (tempoDistance * tempoPace)
    println(f"Total running time is $totalTime%d minutes")
  }
}