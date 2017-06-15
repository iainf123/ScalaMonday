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

    def removeByType(Type : String) : Unit ={
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
   vehicle.fixed = true
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

//def calculation() :{

//}



class Part( var Part: String,
            var fixed: Boolean) {

    def addPart(Part: Part ) : Unit = {
        PartArrayBuffer += Part

    val isItBroken = scala.util.Random
        isItBroken.nextInt(2)
        match {
            case 1 => PartArrayBuffer(PartArrayBuffer.size - 1).fixed = true
            case 0 => PartArrayBuffer(PartArrayBuffer.size - 0).fixed = false
        }
    }


}


abstract class Vehicle {
    val Id: Int
    var model: String
    val Reg:   String
    val Type:  String
    val NoOfTyres: Int
    var fixed: Boolean

    override def toString: String =
        s" Model: $model, Registration: $Reg, Number of Doors: $NoOfTyres"

}

abstract class Person() {
    val Id: Int
    var Fname: String
    var Sname: String
    val Dob:   String

}

class Employee(val Id: Int,
               var Fname: String,
               var Sname: String,
               val Dob:   String)
    extends Person {
    override def toString: String =
        s" Employee: $Id, First Name: $Fname, Surname: $Sname, Date of Birth: $Dob"

}

class Customer(val Id: Int,
               var Fname: String,
               var Sname: String,
               val Dob:   String)
    extends Person {
    override def toString: String =
        s" Customer: $Id, First Name: $Fname, Surname: $Sname, Date of Birth: $Dob"

}

class Car(val Id: Int,
          var model: String,
          val Reg:   String,
          val Type:  String,
          val NoOfTyres: Int,
          var fixed: Boolean)
    extends Vehicle {
    override def toString: String =
        " Car ID: " + Id + " Make Of Car: " + model + " Registration: " + Reg + " Number of Tyres: " + NoOfTyres

}

class Bike (val Id : Int,
            var model: String,
            val Reg:   String,
            val Type:  String,
            val NoOfTyres : Int,
            var fixed : Boolean)
    extends Vehicle {
    override def toString: String =
        s" Bike ID: $Id  Make Of Bike: $model  Registration: $Reg Number of Tyres: $NoOfTyres"

}
var Employee:  Employee = new Employee(1,"iain", "Fraser", "09,03,83")
var Employee1: Employee = new Employee(2,"iain", "Fraser", "09,03,83")
var Employee2: Employee = new Employee(3,"iain", "Fraser", "09,03,83")
var Employee3: Employee = new Employee(4,"iain", "Fraser", "09,03,83")
var Employee4: Employee = new Employee(5,"iain", "Fraser", "09,03,83")

var Customer:  Customer = new Customer(1, "james", "Gallagher", "10,09,95")
var Customer1: Customer = new Customer(2, "james", "Gallagher", "10,09,95")
var Customer2: Customer = new Customer(3, "james", "Gallagher", "10,09,95")
var Customer3: Customer = new Customer(4, "james", "Gallagher", "10,09,95")
var Customer4: Customer = new Customer(5, "james", "Gallagher", "10,09,95")

var car1:      Car = new Car(1, "Ford", "IAF83", "Car", 4,true)
var car2:      Car = new Car(2, "Ford", "IAF83", "Car", 4,true)
var car3:      Car = new Car(3, "Ford", "IAF83", "Car", 4,false)
var car4:      Car = new Car(4, "Ford", "IAF83", "Car", 4,false)
var car5:      Car = new Car(5, "Ford", "IAF83", "Car", 4,false)
var car6:      Car = new Car(6, "Ford", "IAF83", "Car", 4,true)
var car7:      Car = new Car(7, "Ford", "IAF83", "Car", 4,true)
var car8:      Car = new Car(8, "Ford", "IAF83", "Car", 4,true)
var car9:      Car = new Car(9, "Ford", "IAF83", "Car", 4,false)
var car10:     Car = new Car(10,"Ford", "IAF83", "Car", 4,true)

var Bike:      Bike = new Bike(1, "harley davidson", "IAF0983", "Bike", 2,true)
var Bike1:     Bike = new Bike(2, "harley davidson", "IAF0983", "Bike", 2,true)
var Bike2:     Bike = new Bike(3, "harley davidson", "IAF0983", "Bike", 2,false)
var Bike3:     Bike = new Bike(4, "harley davidson", "IAF0983", "Bike", 2,false)
var Bike4:     Bike = new Bike(5, "harley davidson", "IAF0983", "Bike", 2,false)
var Bike5:     Bike = new Bike(6, "harley davidson", "IAF0983", "Bike", 2,true)
var Bike6:     Bike = new Bike(7, "harley davidson", "IAF0983", "Bike", 2,true)
var Bike7:     Bike = new Bike(8, "harley davidson", "IAF0983", "Bike", 2,false)
var Bike8:     Bike = new Bike(9, "harley davidson", "IAF0983", "Bike", 2,true)
var Bike9:     Bike = new Bike(10, "harley davidson", "IAF0983", "Bike", 2,true)

var Garage1:   Garage = new Garage

var Engine:    Part = new Part("engine",true)
var door:      Part = new Part("door", true)
var mirror:    Part = new Part("mirror",true)
var Key:       Part = new Part("Key",true)
var Alternator:Part = new Part("Alternator",false)
var Spring:    Part = new Part ("Spring",false)
var rearDoor:  Part = new Part("rearDoor",true)
var airFilter: Part = new Part("rearDoor",false)
var radiator:  Part = new Part("rearDoor",true)
var bonnet:    Part = new Part("bonnet",false)
var boot:      Part = new Part("boot",true)
var peddle:    Part = new Part("peddle",true)
var handle:    Part = new Part("handle",true)
var radio:     Part = new Part("radio",false)
var knob:      Part = new Part("knob",true)