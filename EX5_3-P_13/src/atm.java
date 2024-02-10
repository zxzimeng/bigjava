import java.util.Scanner;

public class atm {
    private int pin;
    private boolean access = true;

    public atm(int pin) {
        this.pin = pin;
    }

    public void checkout() {
        if (access) {
            Scanner scanner = new Scanner(System.in);
            int tries = 0;
            while (tries < 3) {
                System.out.print("PIN: ");
                if (scanner.nextInt() == this.pin) {
                    System.out.println("Access Granted");
                    return;
                } else {
                    System.out.println("PIN INCORRECT");
                }
                tries += 1;
            }
        }
        System.out.println("Access Blocked");


    }

    public static void main(String[] args) {
        atm aatm = new atm(1234);
        aatm.checkout();
    }
}
