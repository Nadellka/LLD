package WithStrategyDesign.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("This has special drive Strategy");
    }
}
