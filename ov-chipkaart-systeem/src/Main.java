public class Main {
    public static void main(String[] args) {
        OV_Chipkaart kaart = new OV_Chipkaart(10.00, "NL-1234", true);
        Check_In_Paal paal = new Check_In_Paal(1.50);
        paal.inchecken(kaart);
    }
}
