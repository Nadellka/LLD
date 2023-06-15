package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class MacBookObservable implements AmazonStockObservable{

    List<NotificationObserver> observersList = new ArrayList<>();

    int currentStocks = 0;

    @Override
    public void add(NotificationObserver obj){
        this.observersList.add(obj);
    }

    @Override
    public void remove(NotificationObserver obj){
        this.observersList.remove(obj);
    }

    @Override
    public void update(){
        for(NotificationObserver obj : observersList){

            obj.notifyObserver();

        }
    }

    @Override
    public void setStockCount(int newStockCount){
        if(this.currentStocks == 0){
            //notifying the observers that new stock has arrived
            update();
        }
        currentStocks = currentStocks + newStockCount;
    }

    @Override
    public int getStockCount(){
        return currentStocks;
    }
}
