package ObserverDesignPattern;

import ObserverDesignPattern.Observable.AmazonStockObservable;
import ObserverDesignPattern.Observable.MacBookObservable;
import ObserverDesignPattern.Observer.EmailNotificationObserver;
import ObserverDesignPattern.Observer.FaxNotificationObserver;
import ObserverDesignPattern.Observer.NotificationObserver;
import ObserverDesignPattern.Observer.SmsNotificationObserver;
//Walmart Interview
public class AmazonStore {

    public static void main(String[] args){
        AmazonStockObservable macBookObservable = new MacBookObservable();

        NotificationObserver email1 = new EmailNotificationObserver("nkavya1aa0@gmail.com",macBookObservable);
        NotificationObserver email2 = new EmailNotificationObserver("nad3lakavyaa@gmail.com",macBookObservable);

        NotificationObserver sms1 = new SmsNotificationObserver("5133777899", macBookObservable);
        NotificationObserver sms2 = new SmsNotificationObserver("8247458958",macBookObservable);

        NotificationObserver fax1 = new FaxNotificationObserver("5133778799",macBookObservable);

        macBookObservable.add(email1);
        macBookObservable.add(email2);
        macBookObservable.add(sms1);
        macBookObservable.add(sms2);
        macBookObservable.add(fax1);

        macBookObservable.setStockCount(50);
    }
}
