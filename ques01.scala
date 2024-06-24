object AreaofDisk{
    def main(args:Array[String]):Unit = {
        val radius=5
        val area = Math.PI*radius*radius
        println(f"The area of a disk with radius $radius%d is $area%.2f")
    }
}