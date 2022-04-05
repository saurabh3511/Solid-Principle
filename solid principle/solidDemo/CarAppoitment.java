package solidDemo;



class CarAppoitment implements GetCarToken, GetDateTime {

    public void getToken(){
        System.out.print("you token number processing... ");
    }

    public void getDateTime(int date ,int time){
        System.out.println("date"+date+"time "+time);
    }
}