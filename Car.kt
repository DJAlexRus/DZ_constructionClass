class Car (private val weigte:Int, private val speed:Int) {
    fun moveCar (){
        if (speed >0){
            println("Автомобиль массой ${weigte}кг движется вперед со скоростью ${speed}км/ч")
        }else if (speed<0) {
            println("Автомобиль массой ${weigte}кг движется назад со скоростью ${speed}км/ч")
        } else {
            println("Автомобиль массой ${weigte}кг стоит на месте")
        }
    }
}