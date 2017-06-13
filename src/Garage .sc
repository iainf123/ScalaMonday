abstract class Vehicle {
    val Id: Int
    var model: String
    val Reg: String
    val NoOfTyres: Int

    override def toString(): String =
        s" Model: $model, Registration: $Reg, Number of Doors: $NoOfTyres"

}

abstract class Person() {
    val Id: Int
    var Fname: String
    var Sname: String
    val Dob: String

}

class Employee(Id: Int, tmpFname: String, Sname: String, Dob: String) extends Person() {

    override def toString(): String =
        s" Employee: $Id, First Name: $Fname, Surname: $Sname, Date of Birth: $Dob"

}

class Customer(Id: Int, Fname: String, Sname: String, Dob: String) extends Person {
    override def toString(): String =
        s" Customer: $Id, First Name: $Fname, Surname: $Sname, Date of Birth: $Dob"

}

class Car(val Id: Int, var model: String, val Reg: String, val NoOfTyres: Int) extends Vehicle {

    override def toString(): String =
        " Car ID: " + Id + " Make Of Car: " + model + " Registration: " + Reg + " Number of Tyres: " + NoOfTyres

}

class Bike (Id : Int, model : String, Reg : String, NoOfTyres : Int) extends Vehicle {
    override def toString(): String =
        s" Bike ID: $Id  Make Of Bike: $model  Registration: $Reg Number of Tyres: $NoOfTyres"

}
var Employee: Employee = new Employee(1,"iain", "Fraser", "09,03,83")
var Customer: Customer = new Customer(1, "james", "Gallagher", "10,09,95")
var car:      Car = new Car(1, "Ford", "IAF83", 4)
var bike:     Bike = new Bike(2, "harley davidson", "IAF0983", 2)