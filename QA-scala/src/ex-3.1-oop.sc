//Primary & Secondary constructors
class bankAccount(val accNumber: String, initialBalance: Double) {

  def this(accNumber: String) = this(accNumber, 0)
  var newBalance = initialBalance
  //getter
  def balance = newBalance
  //setter
  def deposit(n: Double) = {newBalance += n}
  def withdraw(n: Int): Unit = {
    //User can't withdraw more than is in the account
    if(n > newBalance) println("Not enough money to withdraw amount")
    else newBalance = newBalance - n
  }
  override def toString(): String = "Bank Account: " + accNumber + " " + newBalance
}

//Use the object as a factory via the apply method
object bankAccount {
  private var nextAccountNo = 0;
  //apply method that returns a new bankAccount object

  def apply = {
    nextAccountNo += 1;
    new bankAccount(nextAccountNo.toString)
  }

  def apply(balance: Int) = {
    nextAccountNo += 1;
    new bankAccount(nextAccountNo.toString, balance)
  }


  
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

val b2 = bankAccount(100)

val b3 = bankAccount(500)

//Include a bank account

class Person(val name: String = "Tom") {
  //private var name = "Bob"
  private var privateAge = 0
  private var privateEmail = ""
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