package packages.test;

import packages.technics.Passport;
import packages.technics.PassportUtil;

import java.util.Date;

public class TechnicsMain {
    public static void main(String[] args) {
        Date date = new Date(1594319579000L);
        System.out.println("Дата покупки товара: " + date);
        Passport passportTechnics = new Passport("Samsung","2020",date);

        PassportUtil.warrantyReplace(passportTechnics);
        System.out.println(passportTechnics);
    }
}
