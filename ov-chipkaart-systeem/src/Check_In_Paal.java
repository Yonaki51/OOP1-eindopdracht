public class Check_In_Paal {
    private double instapTarief;

    public Check_In_Paal(double instapTarief) {
        this.instapTarief = instapTarief;
    }

    public void inchecken(OV_Chipkaart kaart) {
        if (!kaart.getGeldig()) {
            System.out.println("Je kaart is niet geldig.");
            return;
        }
        if (kaart.getSaldo() < instapTarief) {
            System.out.println("Je hebt niet genoeg saldo.");
            return;
        }

        kaart.setIsIngecheckt(true);
        System.out.println("Je bent ingecheckt.");
    }

    public void uitchecken(OV_Chipkaart kaart){

        if (!kaart.getIsIngecheckt()){
            System.out.println("Je bent niet ingecheckt.");
            return;
        }

        kaart.setIsIngecheckt(false);
        System.out.println("je bent nu uitgecheckt. je resterende saldo is: " + kaart.getSaldo());
    }
}