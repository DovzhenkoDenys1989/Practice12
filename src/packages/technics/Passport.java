package packages.technics;

import java.util.Date;

public class Passport {
    private String brand;
    private String model;
    Date warrantyStartDate;

    public Passport(String brand, String model, Date warrantyStartDate) {
        this.brand = brand;
        this.model = model;
        this.warrantyStartDate = warrantyStartDate;
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

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}
