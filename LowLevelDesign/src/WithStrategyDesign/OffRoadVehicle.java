package WithStrategyDesign;

import WithStrategyDesign.DriveStrategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
