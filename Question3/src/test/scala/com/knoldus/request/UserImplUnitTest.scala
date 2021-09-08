package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val shashikantUser: User = User("Shashikant","Tyagi",22,"knoldus","shashikant.tyagi@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(shashikantUser)) thenReturn(true)
    val result = userImpl.createUser(shashikantUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(shashikantUser)) thenReturn(false)
    val result = userImpl.createUser(shashikantUser)
    assert(result.isEmpty)
  }

}
