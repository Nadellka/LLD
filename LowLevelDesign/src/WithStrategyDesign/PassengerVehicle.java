package WithStrategyDesign;

import WithStrategyDesign.DriveStrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
