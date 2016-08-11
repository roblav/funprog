//Exercise 3 - Object Oriented Programming

class Person(val name: String = "Tom") {
  //private var name = "Bob"
  private var privateAge = 0
  private var email = ""
  //getter method
  def age = privateAge
  //setter
  def age_=(newAge:Int): Unit = {
    if(newAge > privateAge) privateAge = newAge
  }

  override def toString(): String = s"hi, $name"
  def sayHi() = println(s"hi, $name")
}

val p = new Person

p.toString
p.sayHi
p.age = 21

p.age

val p1 = new Person("Bob")

p1.name

//Primary & Secondary constructors
class bankAccount(val accNumber: String, initialBalance: Int) {
  private var newBalance = initialBalance

  def this(accNumber: String) = this(accNumber, 0)
  //getter
  def balance = newBalance
  //setter
  def deposit(n: Int): Unit = {
    newBalance = newBalance + n
  }
  def withdraw(n: Int): Unit = {
    //User can't withdraw more than is in the account
    if(n > newBalance) 0
    else newBalance = newBalance - n
  }
  override def toString(): String = s"$accNumber"
}

val b1 = new bankAccount("12345678")

b1.balance
b1.deposit(1000)
b1.balance
b1.withdraw(500)
b1.balance
b1.withdraw(700)
b1.balance

b1





