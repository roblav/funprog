abstract trait Vocal {
  def makeNoise(): String
}

trait ConcreteVocal extends Vocal {
  def makeNoise(): String = "Moo"
}

abstract class Animal(name: String, age: Int){
  override def toString = "Animal [" + name + ", " + age + ", " + "]"
  def move: String
}

class Cat(name: String, age: Int) extends Animal(name, age) {
  def move = "saunter"
  override def toString(): String = "Cat [" + super.toString + this.move + "]"
  //def makeNoise(): String = "Meow"
}

class Dog(name: String, age: Int) extends Animal(name, age) with Vocal{
  def move = "bound"
  override def toString(): String = "Dog [" + super.toString + this.move + "]"
  override def makeNoise(): String = "Woof"

}

class Rabbit(name: String, age: Int) extends Animal(name, age) {
  def move = "I'm hopping"
  override def toString(): String = "Rabbit [" + super.toString + this.move + "]"
  //def makeNoise(): String = "Nibble nibble"
}

val c1 = new Cat("Bob", 8) with ConcreteVocal

c1
c1.move
c1.makeNoise()

val d1 = new Dog("Spot", 8)
d1.makeNoise()

val r1 = new Rabbit("Buggsy", 5)

r1

r1.move

//r1.makeNoise()

//Primary & Secondary constructors
class bankAccount(val accNumber: String, initialBalance: Double) extends ConsoleLogger {

  def this(accNumber: String) = this(accNumber, 0)
  var newBalance = initialBalance
  //getter
  def balance = newBalance

  //setter
  def deposit(n: Double) = {
    newBalance += n
  }
  def withdraw(n: Int): Unit = {
    //User can't withdraw more than is in the account
    if(n > newBalance) log("Some message here")
    else newBalance = newBalance - n
  }
  override def toString(): String = "Bank Account: " + accNumber + " " + newBalance
}

class SavingsAccount(accNumber: String, initialBalance: Double) extends bankAccount(accNumber, initialBalance) {
  private val rate: Double = 10
  def addInterest = newBalance = initialBalance + (initialBalance * (rate/100))
}

class CurrentAccount(accNumber: String, initialBalance: Double) extends bankAccount(accNumber, initialBalance) {
  private val overdraft: Double = 100
  override def withdraw(n: Int): Unit = {
    //User can't withdraw more than is in the account
    if(n > newBalance + overdraft) log("BOB - Not enough money to withdraw amount")
    else newBalance = newBalance - n
  }
}

val acc1 = new CurrentAccount("123", 400)

acc1

acc1.withdraw(450)

acc1

acc1.withdraw(60)

acc1

trait Logger {
  def log(msg: String)
}

class ConsoleLogger extends Logger {
  override def log(msg: String) {
    println(msg)
  }
}