package packages.test;

import packages.citizen.Passport;
import static packages.citizen.PassportUtil.marriageRegistrate;

public class CitizenMain {
    public static void main(String[] args) {
        Passport men = new Passport("221195", "Иванов Иван Иванович");
        Passport women = new Passport("545511", "Крамаренко Анастасия Игоревна");

        marriageRegistrate(men, women);
        System.out.println(men);
        System.out.println(women);
    }
}
