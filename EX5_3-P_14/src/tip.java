import java.util.Scanner;

public class tip {
    float total;
    Scanner scanner = new Scanner(System.in);
    private int satisfaction;

    public tip(float bill) {
        this.total = bill;
    }

    private float calculate() {
        System.out.print("Rate satisifaction from 1 (most satisifed) to 3 (last satisified): ");
        this.satisfaction = scanner.nextInt();

        switch (satisfaction) {
            case 1:
                this.total *= 1.2;
                break;
            case 2:
                this.total *= 1.15;
                break;
            case 3:
                this.total *= 1.1;
                break;
        }

        return this.total;
    }

    public static void main(String[] args) {
        tip dinner = new tip(123);
        float bill = dinner.calculate();
        System.out.println(bill);
        int dollar = (int) bill;
        float cents = (bill - dollar) * 100;
        System.out.printf("Total: %d Dollars and %.0f Cents", dollar, cents);
    }
}
