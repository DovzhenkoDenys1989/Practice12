package packages.technics;

import java.util.Date;

public class PassportUtil {
    public PassportUtil() {
        System.out.println("Закрытый конструктор");
    }
    public static void warrantyReplace(Passport passportTechnics){
        Date date2 = new Date();
       passportTechnics.setWarrantyStartDate(date2);
    }
}
