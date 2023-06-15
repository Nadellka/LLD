package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;


public interface AmazonStockObservable {
    void add(NotificationObserver observer);
    void remove(NotificationObserver observer);
    void update();
    void setStockCount(int data);
    int getStockCount();
}
