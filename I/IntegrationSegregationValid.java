package solid.I;


 interface BearCleaner1 {
     void washTheBear();
}

 interface BearFeeder1 {
    void feedTheBear();
}

 interface BearPetter1 {
    void petTheBear();
}

class takeCare implements BearCleaner1, BearFeeder1 {

    void washTheBear() {
        //programmer will clean the bear.
    }

    void feedTheBear() {
        //programmer will feed the bear.
    }
    //since programmer do not want to pet the Bear as he feels dangerous to do so
    //he will not implenment  BearPetter
}
class petPerson implements BearPetter1{
     void petTheBear()
}
public class public class IntegrationSegregationValid {
    {
    //we have overcome our earlier consern by using inteface segregation.
    //
}