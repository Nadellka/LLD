package WithStrategyDesign.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("This has normal drive strategy");
    }
}
