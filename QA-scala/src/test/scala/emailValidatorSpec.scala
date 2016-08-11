/**
  * Created by rob on 25/07/16.
  */

import org.scalatest._

class emailValidatorSpec extends FlatSpec with Matchers {

  "I" should "be able to validate an email address" in {
    emailValidator("robert.lavender") should be (false)
    emailValidator("robert@lavender") should be (false)
    emailValidator("robert.lavender@gmail.com") should be (true)
  }

}
