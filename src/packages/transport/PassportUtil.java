package packages.transport;

class PassportUtil {
    public PassportUtil() {
        System.out.println("Закрытый конструктор");
    }

    public static Passport changeOwner(Passport passportTransport) {
        Passport passportTransport2 = new Passport("Lexus", "Петров Петр Петрович");
        passportTransport.setOwnerName(passportTransport2.getOwnerName());
        return passportTransport;
    }
}

