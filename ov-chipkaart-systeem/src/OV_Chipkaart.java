/**
 * Stelt een OV-chipkaart voor waarmee reizigers kunnen in- en uitchecken
 * in het openbaar vervoer.
 */
public class OV_Chipkaart {

    /** Het huidige saldo op de kaart in euro's. */
    private double saldo;

    /** Het unieke chipnummer waarmee de kaart geïdentificeerd wordt. */
    private String chipNr;

    /** Geeft aan of de kaart geldig (actief) is. */
    private boolean geldig;

    /** Geeft aan of de reiziger momenteel ingecheckt is. */
    private boolean isIngecheckt;

    /**
     * Maakt een nieuwe OV-chipkaart aan.
     *
     * @param saldo   Het beginsaldo op de kaart in euro's.
     * @param chipNr  Het unieke chipnummer van de kaart.
     * @param geldig  {@code true} als de kaart geldig is, anders {@code false}.
     */
    public OV_Chipkaart(double saldo, String chipNr, boolean geldig) {
        this.saldo = saldo;
        this.chipNr = chipNr;
        this.geldig = geldig;
        this.isIngecheckt = false; // Nieuw aangemaakte kaart is standaard niet ingecheckt
    }

    /**
     * Geeft het huidige saldo van de kaart terug.
     *
     * @return Het saldo in euro's.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Geeft aan of de kaart geldig (actief) is.
     *
     * @return {@code true} als de kaart geldig is, anders {@code false}.
     */
    public boolean getGeldig() {
        return geldig;
    }

    /**
     * Stelt in of de reiziger ingecheckt is.
     *
     * @param isIngecheckt {@code true} om de reiziger in te checken,
     *                     {@code false} om uit te checken.
     */
    public void setIsIngecheckt(boolean isIngecheckt) {
        this.isIngecheckt = isIngecheckt;
    }
}