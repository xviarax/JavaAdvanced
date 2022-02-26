package carInfo;

public class Cars {
    private String brand;
    private String model;
    private int horsePower;

    public Cars(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Cars(String brand) {
        this.brand = brand;
        this.horsePower = -1;
        this.model = "unknown";
    }





    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public String Car() {
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePower );
    }
}
