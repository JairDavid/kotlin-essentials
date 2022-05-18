package basics

//to be able to do inheritance we have to declare an open class as well as the methods we want to override
open class Animal(var name:String, var race:String, var age:Int) {

    open fun showData(){
        println("$name, $race, $age")
    }

    open fun sound(){}
}

class Cat(name:String,race:String, age:Int, var behavior:String ):Animal(name, race, age){
    override fun showData() {
        println("$name, $race, $age, $behavior")
    }

    override fun sound() {
        println("Meow Meow")
    }
}

class Bird(name:String, race:String, age:Int, var canFly:Boolean): Animal(name, race, age){
    override fun showData() {
        println("$name, $race, $age, $canFly");
    }

    override fun sound() {
        println("*bird sound* (?)")
    }
}

fun main(args:Array<String>){
    val bird:Bird = Bird("flyfly","uknown",1,true)
    val cat:Cat = Cat("katzen","egipcian",12,"agressive")

    bird.sound()
    cat.sound()
}