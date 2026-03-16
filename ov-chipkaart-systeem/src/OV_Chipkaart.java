public class OV_Chipkaart {
    private static int volgendeChipNummer = 0;
    private double saldo;
    private String chipNr;
    private boolean geldig;
    private boolean isIngecheckt;

    public OV_Chipkaart(double saldo, boolean geldig) {
        this.saldo = saldo;
        this.chipNr = "NL-" + volgendeChipNummer;
        volgendeChipNummer++;
        this.geldig = geldig;
        this.isIngecheckt = false;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getGeldig() {
        return geldig;
    }

    public boolean getIsIngecheckt(){
        return isIngecheckt;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIsIngecheckt(boolean isIngecheckt) {
        this.isIngecheckt = isIngecheckt;
    }
}