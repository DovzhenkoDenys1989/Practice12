package packages.citizen;

public class Passport {
    private String ID;
    private String fullName;
    private String spouseID;

    public Passport(String ID, String fullName) {
        this.ID = ID;
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpouseID() {
        return spouseID;
    }

    public void setSpouseID(String spouseID) {
        this.spouseID = spouseID;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", spouseID='" + spouseID + '\'' +
                '}';
    }
}


