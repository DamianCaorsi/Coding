public class ACUMULADORES {
    int TOTAL = 0;
    int TOTAL1 = 0;
    int TOTAL2 = 0;
    int TOTAL3 = 0;
    int INGRESO = 0;
    int PERSONA = 0;

    int INGRESO1 = 17;
    int INGRESO2 = 0; // Assuming you need this variable

    public void calculateTotals() {
        TOTAL1 = TOTAL + INGRESO1;
        System.out.println("TOTAL = " + TOTAL1);

        TOTAL2 = TOTAL1 + INGRESO2;
        System.out.println("TOTAL2 = " + TOTAL2);
    }

    public static void main(String[] args) {
        ACUMULADORES acumuladores = new ACUMULADORES();
        acumuladores.calculateTotals();
    }
}