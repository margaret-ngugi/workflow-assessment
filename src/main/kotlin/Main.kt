fun main() {
    //Q1.
numbers()
    //Q2.
    println(peopleName(arrayOf("Jane","Margaret","Ann","Rebbecca")))
    //Q3.
    serveDrinks(3)
    serveDrinks(8)
    serveDrinks(20)
    //Q4.
    fizzbuzz()
}
//Q1.
fun numbers(){
    var nums = 0
    for(nums in 1.. 100){
        if(nums%2!=0)
            println(nums)

    }
}
//Q2.
fun peopleName(names:Array<String>):Int{
    var nums = 0
    for (x in names){
        if(x.length>5){
            nums++
        }

    }
    return nums

}
//Q3.
fun serveDrinks(age:Int){
    var age = 0
    if(age in 0.. 6){
        println("Serve a glass of milk")
    }
    else if(age in 7 ..15){
        println("Serve a bottle of fanta")

        }
    else {
        println("Gets a bottle of coca cola")
    }
    }
//Q4.
fun fizzbuzz(){
    for(numbers in 1..100){
        if(numbers %3 == 0 && numbers %5==0){
            println("FizzBuzz")
        }
    else if(numbers %3==0){
        println("Fizz")
        }
else if(numbers %5==0){
    println("Buzz")
}
    }
}















