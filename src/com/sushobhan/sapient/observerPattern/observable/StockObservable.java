package com.sushobhan.sapient.observerPattern.observable;

import com.sushobhan.sapient.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscriber();
    void setStockCount(int newStocksCount);
    int getStockCount();
}
