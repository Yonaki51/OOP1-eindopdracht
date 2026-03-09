/**
 * Startpunt van de applicatie.
 * Demonstreert een eenvoudig gebruik van het OV-chipkaart systeem:
 * er wordt een kaart aangemaakt en vervolgens ingecheckt bij een check-in paal.
 */
public class Main {

    /**
     * Hoofdmethode die het programma start.
     *
     * @param args Opdrachtregelargumenten (worden niet gebruikt).
     */
    public static void main(String[] args) {
        // Maak een OV-chipkaart aan met €10,00 saldo, chipnummer "NL-1234" en geldig status
        OV_Chipkaart kaart = new OV_Chipkaart(10.00, "NL-1234", true);

        // Maak een check-in paal aan met een instaptarief van €1,50
        Check_In_Paal paal = new Check_In_Paal(1.50);

        // Probeer in te checken met de kaart
        paal.inchecken(kaart);
    }
}
