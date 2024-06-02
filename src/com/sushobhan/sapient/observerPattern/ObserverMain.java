package com.sushobhan.sapient.observerPattern;

import com.sushobhan.sapient.observerPattern.observable.IPhoneObservableImpl;
import com.sushobhan.sapient.observerPattern.observable.StockObservable;
import com.sushobhan.sapient.observerPattern.observer.EmailAlertObserverImpl;
import com.sushobhan.sapient.observerPattern.observer.MobileAlertObserverImpl;
import com.sushobhan.sapient.observerPattern.observer.NotificationAlertObserver;

public class ObserverMain {
    public static void main(String[] args) {
        StockObservable iPhoneObservable = new IPhoneObservableImpl();
        // set up observer
        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl(iPhoneObservable,"a1@gmail.com");
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserverImpl(iPhoneObservable,"a2@gmail.com");
        NotificationAlertObserver notificationAlertObserver3 = new MobileAlertObserverImpl(iPhoneObservable,"kumar.sushobhan");

        iPhoneObservable.add(notificationAlertObserver1);
        iPhoneObservable.add(notificationAlertObserver2);
        iPhoneObservable.add(notificationAlertObserver3);

        iPhoneObservable.setStockCount(10);
        iPhoneObservable.setStockCount(0);
        iPhoneObservable.setStockCount(100);
    }
}
