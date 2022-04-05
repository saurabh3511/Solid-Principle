package solidDemo;



class MobileNotificationAlert implements NotificationAlert {

    public void sendMsg(String medium) {
        System.out.println("Message sent to your mobile");
    }


    public void call(String medium) {
        System.out.println("call the customer");
    }
}
