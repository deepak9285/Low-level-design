class User{
    public static void main(String[]args){
        notification notification1 = notificationFactory.createNotification("email");
        notification1.notifyUser();
        notification notification2 = notificationFactory.createNotification("message");
        notification2.notifyUser();
        notification notification3 = factnotificationFactoryory.createNotification("pop-up");
        notification3.notifyUser();

    }
}