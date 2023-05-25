package WithStrategyDesign;

import WithStrategyDesign.DriveStrategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle{
    SportyVehicle(){
        super(new SpecialDriveStrategy());
    }
}
