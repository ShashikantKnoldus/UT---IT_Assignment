package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val ShashikantEmployee: Employee = Employee("Shashikant","Tyagi",22,15000,"Intern","knoldus","shashikant.tyagi@knoldus.com")
  val AmanEmployee: Employee = Employee("Aman","Tyagi",28,75000,"Software Engineer","Philips","aman.tyagi@philips.com")

  val employees: HashMap[String, Employee] = HashMap("Shashikant" -> ShashikantEmployee, "Aman" -> AmanEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
