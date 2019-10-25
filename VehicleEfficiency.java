public class VehicleEfficiency {

    public static void main(String[] args) {
        VehicleType sedan = new VehicleType(VehicleTypeName.SEDAN, 50);
        VehicleType suv   = new VehicleType(VehicleTypeName.SUV,   40);
        VehicleType truck = new VehicleType(VehicleTypeName.TRUCK, 30);

        Vehicle takk       = new Vehicle("Fjord", "Takk",       sedan, 40, 9.5);
        Vehicle beklager   = new Vehicle("Fjord", "Beklager",   sedan, 45, 7.5);
        Vehicle vakker     = new Vehicle("Fjord", "Vakker",       suv, 60, 7.5);
        Vehicle stygg      = new Vehicle("Fjord", "Stygg",        suv, 50, 9.0);
        Vehicle vanskellig = new Vehicle("Fjord", "Vanskellig", truck, 60, 8.75);
        Vehicle lastebil   = new Vehicle("Fjord", "Lastebil",   truck, 40, 9.5);

        tableHeader();
        
        System.out.println(takk);
        System.out.println(beklager);
        System.out.println(vakker);
        System.out.println(stygg);
        System.out.println(vanskellig);
        System.out.println(lastebil);

    }

    private static void tableHeader() {
        System.out.println("\nMake\tModel\t\tType\tMPG\tMeets Standards");
        System.out.println("=======================================================");
    }

}