package packages.transport;

public class Passport {
    private String model;
    private String ownerName;

    public Passport(String model, String ownerName) {
        this.model = model;
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "model='" + model + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

