/**
 * Stelt een check-in paal voor bij een halte of station.
 * De paal controleert of een OV-chipkaart geldig is en voldoende saldo heeft
 * voordat de reiziger wordt ingecheckt.
 */
public class Check_In_Paal {

    /** Het minimale bedrag (in euro's) dat op de kaart moet staan om in te kunnen checken. */
    private double instapTarief;

    /**
     * Maakt een nieuwe check-in paal aan met het opgegeven instaptarief.
     *
     * @param instapTarief Het bedrag in euro's dat gereserveerd wordt bij het inchecken.
     */
    public Check_In_Paal(double instapTarief) {
        this.instapTarief = instapTarief;
    }

    /**
     * Checkt een reiziger in met de gegeven OV-chipkaart.
     * <p>
     * De volgende controles worden uitgevoerd:
     * <ul>
     *   <li>De kaart moet geldig (actief) zijn.</li>
     *   <li>Het saldo op de kaart moet minimaal gelijk zijn aan het instaptarief.</li>
     * </ul>
     * Als aan beide voorwaarden is voldaan, wordt de reiziger ingecheckt.
     *
     * @param kaart De OV-chipkaart waarmee ingecheckt wordt.
     */
    public void inchecken(OV_Chipkaart kaart) {
        // Controleer of de kaart geldig is
        if (!kaart.getGeldig()) {
            System.out.println("Je kaart is niet geldig.");
            return;
        }

        // Controleer of er genoeg saldo op de kaart staat
        if (kaart.getSaldo() < instapTarief) {
            System.out.println("Je hebt niet genoeg saldo.");
            return;
        }

        // Alle controles geslaagd: reiziger inchecken
        kaart.setIsIngecheckt(true);
        System.out.println("Je bent ingecheckt.");
    }
}