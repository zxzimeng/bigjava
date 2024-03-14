//Run it, then replace loop by String.replace(a, b);  and submit with results,
public class WORKED_6_1 {
    public static void main(String[] args) {
        String creditCardNumber = "4123-5678-9012-3450";

//        int i = 0;
//        while (i < creditCardNumber.length())
//        {
//            char ch = creditCardNumber.charAt(i);
//            if (ch == ' ' || ch == '-')
//            {
//                String before = creditCardNumber.substring(0, i);
//                String after = creditCardNumber.substring(i + 1);
//                creditCardNumber = before + after;
//            }
//            else
//            {
//                i++;
//            }
//        }
        creditCardNumber = creditCardNumber.replace(" ","");
        creditCardNumber = creditCardNumber.replace("-","");


        System.out.println(creditCardNumber);
    }
}
