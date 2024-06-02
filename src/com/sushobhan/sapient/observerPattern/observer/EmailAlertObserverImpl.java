package com.sushobhan.sapient.observerPattern.observer;

import com.sushobhan.sapient.observerPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private StockObservable stockObservable;
    private String emailId;

    public EmailAlertObserverImpl(StockObservable stockObservable, String emailId) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is back in stock");
    }

    private void sendEmail(String emailId, String productIsBackInStock) {
        System.out.println("email sent to email : " + emailId);
    }
}
