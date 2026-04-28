class user{
    public static void main(String[] args){
        makePayment payment1 = paymentFactory.createPayment("creditCard");
        payment1.processPayment(100.0);
        makePayment payment2 = paymentFactory.createPayment("debitCard");
        payment2.processPayment(200.0);
        makePayment payment3 = paymentFactory.createPayment("upi");
        payment3.processPayment(300.0);
    }
}