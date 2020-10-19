package packages.citizen;

import packages.Test;

public class PassportUtil {
    public PassportUtil() {
        System.out.println("Закрытый конструктор");
    }
    public static void marriageRegistrate (Passport men, Passport women){
        men.setSpouseID(women.getID());
        women.setSpouseID(men.getID());
    }
}
