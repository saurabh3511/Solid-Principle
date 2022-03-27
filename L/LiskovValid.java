package solid.L;


 interface Car {

    void turnOnEngine();
    void accelerate();
}
 class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}
public class LiskovValid {

    //it applies to inheritance in such a way that the derived class must be completely substitutable
    //for their base class. In other words if class A is a subtype of class B, then we should be able to
    // replace B with A without interrupting the behaviour of the program.
}