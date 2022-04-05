package solidDemo;



class WhatsappNotificationAlert implements NotificationAlert {

    public void sendMsg(String medium) {
        System.out.println("Message sent to your whatsapp");
    }
    public void call(String medium) {
        System.out.println("call the customer ");
    }

}