package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {
  "password" should "be invalid as it contains space" in {
    val password = new PasswordValidator("12345")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any digit" in {
    val password = new PasswordValidator("1234567")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is less than 8" in {
    val password = new PasswordValidator("123456789")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as the length is more than 15" in {
    val password = new PasswordValidator("qwerty123")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any lowercase letter" in {
    val password = new PasswordValidator("qwerty1234")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any uppercase letter" in {
    val password = new PasswordValidator("qwerty12345")
    assert(!password.passwordIsValid)
  }

  "password" should "be invalid as it does not contains any special character" in {
    val password = new PasswordValidator("qwerty123456")
    assert(!password.passwordIsValid)
  }

  "password" should "be valid" in {
    val password = new PasswordValidator("qwerty1234567")
    assert(password.passwordIsValid)
  }
}