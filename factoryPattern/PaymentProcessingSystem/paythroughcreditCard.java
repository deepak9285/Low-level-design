class paythroughcreditCard implements makePayment{
    @Override
    public void processPayment(double amount){
        System.out.println("processing credit card payment of amount: " + amount);
    }
}