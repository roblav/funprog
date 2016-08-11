/**
  * Created by rob on 25/07/16.
  */

object emailValidator {

  def apply(email: String) :Boolean = {
    //true
    //Check the string contains an @ symbol
    email.contains('@') && email.contains('.')
  }

}
