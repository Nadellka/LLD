package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.AmazonStockObservable;

public class SmsNotificationObserver implements NotificationObserver{
    private String phoneNo;
    private AmazonStockObservable observable;

    public SmsNotificationObserver(String phoneNo, AmazonStockObservable obs){
        this.phoneNo = phoneNo;
        this.observable = obs;

    }

    @Override
    public void notifyObserver() {
        notifyObserverViaEmail(phoneNo, "Message sent to phone:  ");

    }

    private void notifyObserverViaEmail(String phoneNo, String message){
        System.out.println(message + this.phoneNo);
    }
}
