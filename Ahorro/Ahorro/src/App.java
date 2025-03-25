public class App {
    public static void main(String[] args) {
        ACUMULADORES acumuladores = new ACUMULADORES();
        acumuladores.calculateTotals();
    }
}

class ACUMULADORES {
    int TOTAL = 0;
    int TOTAL1 = 0;
    int TOTAL2 = 0;
    int TOTAL3 = 0;
    int INGRESO = 0;
    int PERSONA = 0;

    int INGRESO2 = 230;
    int INGRESO3 = 120;
    int INGRESO1 = 17;
    
    public void calculateTotals() {
        TOTAL1 = TOTAL + INGRESO1;
        System.out.println("TOTAL = " + TOTAL1);

        TOTAL2 = TOTAL1 + INGRESO2;
        System.out.println("TOTAL1 = " + TOTAL2);

        TOTAL3 = TOTAL2 + INGRESO3;
        System.out.println("TOTAL2 = " + TOTAL3);
    }
}



