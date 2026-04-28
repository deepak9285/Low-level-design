class paythroughdebitCard implements makePayment{
    @Override
    public void processPayment(double amount){
        System.out.println("processing debit card payment of amount: " + amount);
    }
}