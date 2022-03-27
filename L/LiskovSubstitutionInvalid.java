package solid.L;


 interface Car1 {

    void turnOnEngine();
    void accelerate();
    void petrol();
}
 class ElectricCar implements Car1 {

    public void turnOnEngine() {
        // car on
    }

    public void accelerate() {
        //this acceleration is crazy!
    }
    public void petrol(){
        throw new AssertionError("I don't have  petrol !");
    }
}
public class LiskovSubstitutionInvalid {
//    it applies to inheritance in such a way that the derived class must be completely substitutable
//    for their base class. In other words if class A is a subtype of class B, then we should be able to
//     replace B with A without interrupting the behaviour of the program.
//    Here we can see class ElectricCar can not be replaced by class Car1 so it violates the Liskov Substitution principle
}