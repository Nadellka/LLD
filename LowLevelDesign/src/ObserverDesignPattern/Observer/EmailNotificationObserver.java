package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.AmazonStockObservable;

public class EmailNotificationObserver implements NotificationObserver{

    private String emailId;
    private AmazonStockObservable observable;

    public EmailNotificationObserver(String emailId, AmazonStockObservable obs){
        this.emailId = emailId;
        this.observable = obs;

    }

    @Override
    public void notifyObserver() {
        notifyObserverViaEmail(emailId, "Message sent to email:  ");

    }

    private void notifyObserverViaEmail(String emailId, String message){
        System.out.println(message + this.emailId);
    }
}
