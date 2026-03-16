public class Main {
    public static void main(String[] args) {
        OV_Chipkaart kaart = new OV_Chipkaart(10.00, true);
        Check_In_Paal paal = new Check_In_Paal(1.50);
        Oplaadpaal automaat = new Oplaadpaal();
        paal.inchecken(kaart);
        paal.uitchecken(kaart);
        paal.toonSaldo(kaart);
        automaat.saldoOpwaarderen(kaart, 20);
        automaat.toonSaldo(kaart);
    }
}
