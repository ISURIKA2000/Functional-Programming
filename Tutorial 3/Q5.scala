def main(args:Array[String]):Unit={
    def easy(d:Int):Int=d*8
    def tempo(d:Int):Int=d*7

    println("Total running time:")
    println(easy(2)+tempo(3)+easy(2))
}