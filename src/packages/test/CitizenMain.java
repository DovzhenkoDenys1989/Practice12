package packages.test;

import packages.citizen.Passport;
import packages.citizen.PassportUtil;

public class CitizenMain {
    public static void main(String[] args) {
        Passport men = new Passport("221195", "Иванов Иван Иванович");
        Passport women = new Passport("545511","Крамаренко Анастасия Игоревна");

        PassportUtil.marriageRegistrate(men,women);
        System.out.println(men);
        System.out.println(women);
    }
}
