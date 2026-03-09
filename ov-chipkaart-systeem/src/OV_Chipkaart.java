public class OV_Chipkaart {
    private double saldo;
    private String chipNr;
    private boolean geldig;
    private boolean isIngecheckt;

    public OV_Chipkaart(double saldo, String chipNr, boolean geldig) {
        this.saldo = saldo;
        this.chipNr = chipNr;
        this.geldig = geldig;
        this.isIngecheckt = false;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getGeldig() {
        return geldig;
    }

    public void setIsIngecheckt(boolean isIngecheckt) {
        this.isIngecheckt = isIngecheckt;
    }
}