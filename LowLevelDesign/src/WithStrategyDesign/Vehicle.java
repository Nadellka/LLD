package WithStrategyDesign;

import WithStrategyDesign.DriveStrategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    //Constructor dependency injection
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
