public class VehicleType {

    private VehicleTypeName name;
    private double fuelStandard = 0.0; // mpg

    public VehicleType(VehicleTypeName name, double fuelStandard) {
        this.name = name;
        this.fuelStandard = fuelStandard;
    }

    public double getFuelStandard() {
        return this.fuelStandard;
    }

    public String getType() {
        return this.name.toString();
    }

}