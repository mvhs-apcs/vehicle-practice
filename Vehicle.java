class Vehicle {

    String make;
    String model;
    VehicleType type;
    double tankSize = 0.0; // liters
    double tankTime = 0.0; // hourse
    double mpg = 0.0;

    public static final double LITERS_TO_GALLONS = 0.264172;
    public static final double TEST_SPEED = 60.0; // mph
    public static int TAB_WIDTH = 8;

    public Vehicle(String make, 
                   String model, 
                   VehicleType type, 
                   double tankSize, 
                   double tankTime) 
    {
        this.make = make;
        this.model = model;
        this.type = type;
        this.tankSize = tankSize;
        this.tankTime = tankTime;
    }

    public double mpg() {
        return TEST_SPEED * tankTime / (tankSize * LITERS_TO_GALLONS);
    }

    public boolean meetsStandards() {
        return mpg() >= this.type.getFuelStandard();
    }

    public String getVehicleClass() {
        return this.type.getType();
    }

    public String toString() {
        String separator = "\t";
        if (model.length() < TAB_WIDTH) separator += "\t";
        return make + "\t" + model + separator + 
                getVehicleClass() + "\t" + 
                nearestTenth(mpg()) + "\t" + 
                meetsStandards();
    }

    private double nearestTenth(double n) {
        return ((int)(n * 10.0)) / 10.0;
    }



}