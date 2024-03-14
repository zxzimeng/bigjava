//E6.1Write programs with loops that compute
//
//a.The sum of all even numbers between 2 and 100 (inclusive).
//
//b.The sum of all squares between 1 and 100 (inclusive).
//
//c.All powers of 2 from 20 up to 220.
//
//d.The sum of all odd numbers between a and b (inclusive), where a and b are inputs.
//
//e.The sum of all odd digits of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
import java.math.*;
public class E6_1 {
    private int sum_even(){
        int sum = 0;
        for (int i=2; i<=100; i+=2){
            sum += i;
        }
        return sum;
    }

    private int sum_squares(){
        int sum = 0;
        for (int i=1; i<=100; i++){
            if (i*i <= 100) {
                sum += i*i;
            }else{
                break;
            }
        }
        return sum;
    }

    private void powers_of_two(){
        for (int i=2; i<220; i++){
            System.out.println(Math.pow(2, i));
        }
    }

    private int sum_odd(int a, int b){
        int sum = 0;
        if (a%2==0){
            a+=1;
        }
        for (int i=a; i<=b; i+=2){
            sum += i;
        }
        return sum;
    }

    private int sum_number(int a){
        int x = a;
        int sum = 0;
        for (int i=10; x*10>=i; i*=10){
            sum+=a%i/(i/10);
        }
        return sum;
    }

    public static void main(String[] args) {
        E6_1 x = new E6_1();
        System.out.println("break");
        System.out.println(x.sum_even());
        System.out.println("break");
        System.out.println(x.sum_squares());
        System.out.println("break");
        x.powers_of_two();
        System.out.println("break");
        System.out.println(x.sum_odd(1, 6));
        System.out.println("break");
        System.out.println(x.sum_number(360));
    }
}
