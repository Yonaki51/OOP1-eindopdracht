public class Oplaadpaal {

public void saldoOpwaarderen(OV_Chipkaart kaart, double bedrag){

    kaart.setSaldo(kaart.getSaldo() + bedrag);
    System.out.println("Je hebt " + bedrag + " op je kaart gezet.");

}

public void toonSaldo(OV_Chipkaart kaart) {
        System.out.println("je nieuwe saldo is: " + kaart.getSaldo());
    }

}
