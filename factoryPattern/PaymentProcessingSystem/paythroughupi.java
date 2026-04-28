class paythroughupi implements makePayment{
    @Override
    public void processPayment(double amount){
        System.out.println("processing UPI payment of amount: " + amount);
    }
}