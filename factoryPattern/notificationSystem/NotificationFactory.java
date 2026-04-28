class NotificationFactory{
    public static notification createNotification(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        if(type.equalsIgnoreCase("message")){
            return new MessageService();
        }
        else if(type.equalsIgnoreCase("email")){
            return new EmailService();
        }
        else if(type.equalsIgnoreCase("popup")){
            return new popNotification();
        }
        return null;
    }
}