fun main() {
//Заданее1
    val box = Box(2,4,3)
    println("Объем коробки равен: ${box.volumeBox()}")
//Задание2
    println()
    val n=20
    val arrN=Array<Int>(n){(10..90).random()}
    println("Дан набор элементов:" + arrN.contentToString())
    val maxArrN=arrN.maxOrNull()
    val minArrN = arrN.minOrNull()
    println("Максимальный элемент: $minArrN, минимальный элемент $maxArrN.")
//задание3
    println()
    val arrInt = arrayOf(3,67,1,55,65,89,23)
    println("Элементы массива: ${arrInt.contentToString()}")
//задание4
    println()
    var a= (-90..90).random()
    println("$a ->'${propertyInt(a)}'")
//задание5
    println()
    val carOne = Car(1200, 40)
    val carTwo = Car(2500, 0)
    val carThree = Car(900, -10)

    carOne.moveCar()
    carTwo.moveCar()
    carThree.moveCar()

}
fun propertyInt (a:Int):String{
    val strResult = if (a!=0){
        if (a>0){
            if (a%2==0) "положительное четное число" else "положительное нечетное число"
        }else{
            if (a%2==0) "отрицательное четное число" else "отрицательное нечетное число"
        }
    }else{
        "Нулевое число"
    }
    return strResult
}