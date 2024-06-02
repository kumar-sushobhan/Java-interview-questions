package com.sushobhan.sapient.observerPattern.observable;

import com.sushobhan.sapient.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        observerList.stream()
                .forEach(observer -> observer.update());
    }

    @Override
    public void setStockCount(int newStocksCount) {
        if (newStocksCount > 0){
            if (stockCount == 0){
                notifySubscriber();
            }
            stockCount = stockCount + newStocksCount;
        } else if (newStocksCount == 0) {
            System.out.println("Stock is present for buying");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Stock is empty");
            stockCount = 0;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
