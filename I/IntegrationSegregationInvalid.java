package solid.I;


 interface bearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
 class Programmer implements bearKeeper{
    void washTheBear(){
        //programmer will wash the beer
    }
    void feedTheBear(){
        //programmer will wash the beer
    }
    void petTheBear(){
        //programmer will pet the beer even if he does not want to do that.
    }
}
public class IntegrationSegregationInvalid {
    //To overcome the exceptions we have to create three different interfaces.
    //
}