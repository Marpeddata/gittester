public abstract class AFuelCar extends ACar {
    private int kmPrLitre;

    AFuelCar(String licensePlate, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(licensePlate, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }


    abstract String getFuelType();

    public int getKmPrLitre(){

        return kmPrLitre;
    }



}
