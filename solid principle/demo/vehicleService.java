package solid.demo;
// ---------------------------
//  single responsibility
//  here in cleaning interface it is only one responsibility
//  only one reason to change


interface cleaning{
    void washing();
    void polishing();
}

interface NotificationAlert{
    public void sendMsg(String Medium);
    public void call(String medium);
}
//  ---------------------------
//     open/closed - open for extension close for modification
//    we have to add feature of sending alert through mobile,whatsapp and  email
//    instead of modifying in notification i have implemented it

class MobileNotificationAlert implements NotificationAlert {
    @Override
    public void sendMsg(String medium) {
        System.out.println("Message sent to your mobile");
    }

    @Override
    public void call(String medium) {
        System.out.println("call the customer");
    }
}


class WhatsappNotificationAlert implements NotificationAlert {
    @Override
    public void sendMsg(String medium) {
        System.out.println("Message sent to your whatsapp");
    }
    public void call(String medium) {
        System.out.println("call the customer ");
    }

}
// ----------------------------
//    Liskov Substitution

interface testingSpeed{
    public void speed();
}
interface bodyPartTesting{
    public void engineTesting();
    public void breakTesting();
}

class carTesting implements testingSpeed,bodyPartTesting{

    @Override
    public void speed(){
        System.out.println("speed of car test pass");
    }
    @Override
    public void engineTesting(){
        System.out.println("engine of car test pass");
    }
    @Override
    public void breakTesting(){
        System.out.println("breaks of car test pass");
    }
}

class bikeTesting implements testingSpeed,bodyPartTesting{

    @Override
    public void speed(){
        System.out.println("speed of bike test pass");
    }
    @Override
    public void engineTesting(){
        System.out.println("engine of bike test pass");
    }
    @Override
    public void breakTesting(){
        System.out.println("breaks of bike test pass");
    }
}

//------------------------
//      Interface Segregation

interface GetCarToken{
    public void getToken();
}
interface GetBikeToken{
    public void getBikeToken();
}
interface GetDateTime{
    public void getDateTime(int data,int time);
}

class CarAppoitment implements GetCarToken,GetDateTime{

    public void getCarToken(){
        System.out.print("you token number processing... ");
    }

    public void getDateTime(int date ,int time){
        System.out.println("date"+date+"time "+time);
    }
}


//--------------------------------------
//    Dependency Inversion
//  instead of tightly coupling cash,upi and card we use paymentMethod
//  which is implemented by all cash, upi and card
interface paymentMethod{
    public void pay(int amount);
}
class cash implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using CASH");
    }
}
class upi implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using UPI");
    }
}
class card implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using CARD");
    }
}
class paymentManager{
    private paymentMethod pm;
    public paymentManager(paymentMethod pm){
        this.pm=pm;
    }
    public void makeTransaction(int amount){
        pm.pay(amount);
    }
}

//------------------------------------
public class vehicleService {
    public static void main(String[] args){
        bikeTesting obj = new bikeTesting();
        obj.speed();
    }
}
