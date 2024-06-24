object VolumeSphere {
    def main(args: Array[String]): Unit = {
        val radius=5
        val volume = (4.0/3.0)*Math.PI*radius*radius*radius
        println(f"Volume of Sphere is = $volume%.2f")
    }
}