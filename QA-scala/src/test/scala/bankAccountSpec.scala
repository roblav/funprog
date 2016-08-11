
import org.scalatest._

class bankAccountSpec extends FlatSpec with Matchers {

  "I" should "be able to create a new bank account by passing in an account number" in {
    val b1 = new bankAccount("12345678")
    b1.toString() should be ("Bank Account: 12345678 0.0")
  }

  "I" should "be able to deposit money and view my balance" in {
    val b1 = new bankAccount("12345678")
    b1.deposit(1000)
    b1.balance should be (1000)
  }

  "I" should "be able to withdraw money and check my balance" in {
    val b1 = new bankAccount("12345678")
    b1.deposit(1000)
    b1.withdraw(500)
    b1.balance should be (500)
  }

  "I" should "not be able to withdraw more money than I have in my account" in {
    val b1 = new bankAccount("12345678")
    b1.deposit(1000)
    b1.withdraw(500)
    b1.withdraw(700)
    b1.balance should be (500)
  }

  "I" should "be able to create a new bank by depositing money" in {
    val b2 = bankAccount(100)
    b2.balance should be (100)
  }

  "I" should "be able to withdraw all the money from my account" in {
    val b2 = bankAccount(100)
    b2.withdraw(100)
    b2.balance should be (0)
  }

  "I" should "be able to create a new person" in {
    val p1 = new Person
    p1.toString() should be ("hi, Tom")
  }


}

