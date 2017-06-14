import com.sun.xml.internal.ws.api.pipe.Engine
import sun.management.snmp.jvmmib.EnumJvmMemPoolCollectThreshdSupport

import scala.collection.mutable.ArrayBuffer
var VehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
var EmployeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]
var PartArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Part]

class Garage {
    val isOpen : Boolean = true
    val fixed  : Boolean = true

    def addVehicle(vehicle: Vehicle) : Unit ={
        VehicleArrayBuffer += vehicle
    }

    def addEmployee(employee: Employee) : Unit ={
        EmployeeArrayBuffer += employee
    }
}

    def removeById(Id : Int) : Unit ={
       VehicleArrayBuffer.foreach(vehicle => if (Id == vehicle.Id) {
           VehicleArrayBuffer -= vehicle
       })
    }

    def removeByType(Type : Int) : Unit ={
    VehicleArrayBuffer.foreach(vehicle => if (Type == vehicle.Type) {
        VehicleArrayBuffer -= vehicle
    })
}

def viewContents(): Unit = {
    println("Vehicles:")
    if (VehicleArrayBuffer.isEmpty) {
        println("There are no vehicles.")
    } else {
        VehicleArrayBuffer.foreach(println)
    }
    println("Employees:")
    if (EmployeeArrayBuffer.isEmpty) {
        println("There are no employees.")
    } else {
        EmployeeArrayBuffer.foreach(println)
    }
}

def fix(vehicle: Vehicle): Unit = {
   // vehicle.fixed = true
}

def registerEmployee(employee: Employee): Unit = {
    EmployeeArrayBuffer += employee
}

def open(): Unit = {
    //this.isOpen = true
}

def close(): Unit = {
    //this.isOpen = false
}



class Part {
    def addEmployee(part: Part) : Unit ={
        PartArrayBuffer += part
    }

}


abstract class Vehicle {
    val Id: Int
    var model: String
    val Reg: String
    val Type: String
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

class Employee(val Id: Int,
               var Fname: String,
               var Sname: String,
               val Dob: String)
    extends Person {
    override def toString(): String =
        s" Employee: $Id, First Name: $Fname, Surname: $Sname, Date of Birth: $Dob"

}

class Customer(val Id: Int,
               var Fname: String,
               var Sname: String,
               val Dob: String)
    extends Person {
    override def toString(): String =
        s" Customer: $Id, First Name: $Fname, Surname: $Sname, Date of Birth: $Dob"

}

class Car(val Id: Int,
          var model: String,
          val Reg: String,
          val Type: String,
          val NoOfTyres: Int)
    extends Vehicle {
    override def toString(): String =
        " Car ID: " + Id + " Make Of Car: " + model + " Registration: " + Reg + " Number of Tyres: " + NoOfTyres

}

class Bike (val Id : Int,
            var model : String,
            val Reg : String,
            val Type : String,
            val  NoOfTyres : Int)
    extends Vehicle {
    override def toString(): String =
        s" Bike ID: $Id  Make Of Bike: $model  Registration: $Reg Number of Tyres: $NoOfTyres"

}
var Employee: Employee = new Employee(1,"iain", "Fraser", "09,03,83")
var Customer: Customer = new Customer(1, "james", "Gallagher", "10,09,95")
var car:      Car = new Car(1, "Ford", "IAF83", "Car", 4)
var Bike:     Bike = new Bike(2, "harley davidson", "IAF0983", "Bike", 2)
var Garage1:  Garage = new Garage
var Part:     Part = new Part

var engine:   Engine = new Engine("engine")