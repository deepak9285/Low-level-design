class PaymentFactory {
    public static makePayment getPaymentMethod(String paymentType){
        if(paymentType == null){
            return null;
        }
        if(paymentType.equalsIgnoreCase("CREDIT_CARD")){
            return new paythroughcreditCard();
        } else if(paymentType.equalsIgnoreCase("DEBIT_CARD")){
            return new paythroughdebitCard();
        } else if(paymentType.equalsIgnoreCase("UPI")){
            return new paythroughupi();
        }
        return null;
    }
}