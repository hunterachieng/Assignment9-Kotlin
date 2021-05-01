

fun main(){
    println(namesList(mutableListOf("Amanda","Chloe","Devon","Steve","Clinton","Moses","Kevin","Linda","Austin","Wesley")))
    println(heightList(listOf(1.5,1.75,1.8,1.6,1.85,1.9,1.65)))
    var people = mutableListOf(
        Person("Kelvin",30,1.9,75.0),
        Person("Louise",24,1.5,57.8),
        Person("Millicent",28,1.55,70.4),
        Person("Grace",20,1.43,51.5)
    )
    var sortedPerson = people.sortedByDescending { person -> person.age }
    println(sortedPerson)
    people.addAll(listOf(
        Person("Hilda",45,1.7,80.5),
        Person("George",56,1.6,74.0)
    ))
    println(people)



    println(averageMileage((listOf(
        Car("KKK 345C",20),
        Car("KDA 001A",30),
        Car("KAH 428Y",11),
        Car("KAU 186E",10)))))


}
fun namesList(names:List<String>):MutableList<String>{
    var output = mutableListOf<String>()
    names.forEachIndexed { index, character ->
        if(index%2 == 0){
            output.add(character)
        }
    }
    return output
}
data class HeightList(var average:Double,var sum:Double)

fun heightList (height:List<Double>):HeightList{
    var sum = height.sum()
    var average = height.average()
    var avgsum = HeightList(average,sum)
    return avgsum
}
data class Person (var name:String, var age:Int, var height:Double,var weight:Double)

data class Car(var registration:String,var mileage:Int)

fun averageMileage (cars:List<Car>):Int{
    var sum = 0
    for (items in cars){
      sum+= items.mileage
    }
    return sum/cars.size

}

