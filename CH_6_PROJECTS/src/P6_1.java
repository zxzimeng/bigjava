public class P6_1 {
    public static void main(String[] args) {
        String creditCardNumber = "4012 8888 8888 1881";

        if (isValidCreditCard(creditCardNumber)) {
            System.out.println("Credit card number is valid.");
        } else {
            System.out.println("Credit card number is not valid.");
        }
    }


    private static boolean isValidCreditCard(String creditCardNumber) {
        creditCardNumber = creditCardNumber.replace(" ", "").replace("-", "");
        int sumOfAllDigits = 0;
        for (int i = 0; i < creditCardNumber.length(); i++) {
            int digit = Character.getNumericValue(creditCardNumber.charAt(i));
            sumOfAllDigits += digit;
        }
        System.out.println(sumOfAllDigits);

        // add every second digit starting from the second-to-last digit
        for (int i = creditCardNumber.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(creditCardNumber.charAt(i));
            sumOfAllDigits = (digit > 4) ? sumOfAllDigits+1 : sumOfAllDigits;
            sumOfAllDigits += digit;
        }
        System.out.println(sumOfAllDigits);

        // check divisible by 10
        return sumOfAllDigits % 10 == 0;
    }
}
