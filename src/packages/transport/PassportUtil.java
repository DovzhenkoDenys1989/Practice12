package packages.transport;

public class PassportUtil {
    public PassportUtil() {
        System.out.println("Закрытый конструктор");
    }

    public static void changeOwner(Passport passportTransport){
        Passport passportTransport2 = new Passport("Lexus", "Петров Петр Петрович");
        passportTransport.setOwnerName(passportTransport2.getOwnerName());
    }
}
