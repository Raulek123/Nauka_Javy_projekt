package ProgramowanieObiektowe1.Cabrio;

public class Cabrio {
    private String name;
    private String brand;
    private String model;
    private boolean isGoes;
    private boolean isRoofOpen;

    public Cabrio(String name, String brand, String model, boolean isGoes, boolean isRoofOpen) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.isGoes = isGoes;
        this.isRoofOpen = isRoofOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isGoes() {
        return isGoes;
    }

    public void setGoes(boolean goes) {
        isGoes = goes;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if(isGoes){
            System.err.println("Nie można otworzyć/złożyć dachu, gdy samochód jest w ruchu");
        } else {
            isRoofOpen = roofOpen;
        }
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isGoes=" + isGoes +
                ", isRoofOpen=" + isRoofOpen +
                '}';
    }
}
