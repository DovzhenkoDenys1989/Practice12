package packages.test;

import packages.transport.Passport;
//import packages.transport.PassportUtil;

public class TransportMain {
    public static void main(String[] args) {
        Passport passportTransport = new Passport("Lexus", "Зубцов Максим Дмитриевич");
        Passport passportTransport2 = new Passport("Lexus", "Петров Петр Петрович");

        passportTransport.changeOwner(passportTransport);
        System.out.println(passportTransport);
    }
}
