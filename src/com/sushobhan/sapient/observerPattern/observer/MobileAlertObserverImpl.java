package com.sushobhan.sapient.observerPattern.observer;

import com.sushobhan.sapient.observerPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    private String userName;
    private StockObservable stockObservable;

    public MobileAlertObserverImpl(StockObservable stockObservable, String userName) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "product is back in stock");
    }

    private void sendMessageOnMobile(String userName, String productIsBackInStock) {
        System.out.println("message sent to mobile number with username : " + userName);
    }
}
