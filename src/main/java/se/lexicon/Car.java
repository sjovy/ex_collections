package se.lexicon;

public class Car {

    //Add fields for ID ,Brand and Model
    private int ID;
    private String brand;
    private String model;

    //Add a constructor that takes three parameters and initializes the fields
    public Car(int ID, String brand, String model) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
    }

    //Add a getter for the ID field
    public int getID() {
        return ID;
    }

    //Add a setter for the ID field
    public void setID(int ID) {
        this.ID = ID;
    }

    //Add a getter for the Brand field
    public String getBrand() {
        return brand;
    }

    //Add a setter for the Brand field
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Add a getter for the Model field
    public String getModel() {
        return model;
    }

    //Add a setter for the Model field
    public void setModel(String model) {
        this.model = model;
    }

    //Override the toString method
    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", brand=" + brand +
                ", model=" + model + "}";
    }
}
