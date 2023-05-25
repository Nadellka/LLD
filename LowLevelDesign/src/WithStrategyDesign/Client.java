package WithStrategyDesign;

public class Client {

    public static void main(String [] args){

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();

        Vehicle sportyVehicle = new SportyVehicle();
        sportyVehicle.drive();



    }
}
