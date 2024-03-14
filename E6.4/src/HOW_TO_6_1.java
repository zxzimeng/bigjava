import java.util.Scanner;

public class HOW_TO_6_1 {
    public static void main(String[] args) {
//        loop from two
//        Scanner in = new Scanner(System.in);
//        double highestValue;
//        highestValue = in.nextDouble();
//        int highestMonth = 1;
//        for (int currentMonth = 2; currentMonth <= 12; currentMonth++)
//        {
//            double nextValue = in.nextDouble();
//            if (nextValue > highestValue)
//            {
//                highestValue = nextValue;
//                highestMonth = currentMonth;
//            }
//        }
//        System.out.println(highestMonth);
//    }
//        loop from two
    Scanner in = new Scanner(System.in);
    double highestValue;
    highestValue = 0;
    int highestMonth = 0;

        for (int currentMonth = 1; currentMonth <= 12; currentMonth++)
    {
        double nextValue = in.nextDouble();
        if (nextValue > highestValue)
        {
            highestValue = nextValue;
            highestMonth = currentMonth;
        }
    }
        System.out.println(highestMonth);
}
}

//Your program should read twelve temperature values and print the month with the highest temperature.
