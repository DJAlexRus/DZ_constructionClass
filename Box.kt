class Box (private val width: Int, private val height: Int, private val depth:Int){
    fun volumeBox():Int{
        val result = width*height*depth
        return result
    }
}