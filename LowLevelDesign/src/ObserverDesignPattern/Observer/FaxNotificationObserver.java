package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.AmazonStockObservable;

public class FaxNotificationObserver implements NotificationObserver{
    private String fax;
    private AmazonStockObservable observable;

    public FaxNotificationObserver(String fax, AmazonStockObservable obs){
        this.fax = fax;
        this.observable = obs;

    }

    @Override
    public void notifyObserver() {
        notifyObserverViaEmail(fax, "Message sent to fax:  ");

    }

    private void notifyObserverViaEmail(String fax, String message){
        System.out.println(message + this.fax);
    }
}
