package solid.demo;

class vehicleServices {

    public void washing(){
        // washing stuff
    }
    public void  polishing(){
        //polishing stuff
    }


    public void sendOtp(String Medium){
        if(Medium.equals("email")){
            //write email related logic
        }
        if(Medium.equals("mobile")){
            //write message related logic
        }
    }

}

// this class has more than one reason to change
//hence it violates the single responsibility function.

//----------------------------------------------------------------------------
//    open/closed
class notificationService {
    public void sendOtp(String Medium){
        if(Medium.equals("email")){
            //write email related logic
        }
        if(Medium.equals("mobile")){
            //write message related logic
        }
    }
}
// if we want to add a new feature in notification services to send otp via whatsapp
//we have to modify in the notification services class
//hence it violates the open /closed principle
//---------------------------------------------------------------------------------------------------------
//    LISKOV SUBSTITUTION
class test{
    public void speed();
    public void engineTesting();
    public void breakTesting();
    public void seatBeltTesting();
}

class bikeTesting extends test{
    public void speed(){
        //speed test
    }
    public void engineTesting(){
        //engine test
    }
    public void breakTesting(){
        //break test
    }
}
// although bikeTesting extends test but bike
// doesn't have seat belt so seatBeltTesting can't be performed
// so bikeTesting can't replace by class test
// this violates the rule

//-----------------------------------------------------------------------
//      Interface Segregation

interface getappoitment{
    void bikeToken();
    void carToken();
    void Date();
    void Time();
    void
}
class carAppoitment implements getappoitment{
    public void Token(){
//        token fixed
    }
    public void Date(){
        //date fixed
    }
    public void Time(){
        //time fixed
    }

}
// here class carAppoitment dosn't need bikeToken function
// which is violating the rule

//---------------------------------------------------------------------------
//    Dependency Inversion

interface payment{

    public void pay();
    public void printReceipt;
}
class cash implements payment{
    public void pay(){
        // payment by cash
    }
    public void printReceipt(){
        //error voilation of dependency Inversion
    }
}
class card implements payment{
    public void pay(){
        // payment by card
    }
    public void printReceipt(){
        //print receipt
    }
}
//---------------------------------------------------------------------

public class vehicleServiceInvalid {
    public static void main(){

    }
}
