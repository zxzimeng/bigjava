import java.util.Scanner;

public class unitconversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("value: ");
        double value = scanner.nextDouble();

        System.out.print("from unit: ");
        String source_unit = scanner.next().toLowerCase();

        System.out.print("to unit: ");
        String targetUnit = scanner.next().toLowerCase();

        if (is_length(source_unit) && is_length(targetUnit)) {
            double result = convertLength(value, source_unit, targetUnit);
            System.out.println(value + " " + source_unit + " is equal to " + result + " " + targetUnit);
        } else if (is_volume(source_unit) && is_volume(targetUnit)) {
            double result = convertVolume(value, source_unit, targetUnit);
            System.out.println(value + " " + source_unit + " is equal to " + result + " " + targetUnit);
        } else {
            System.out.println("invalid");
        }
    }

    private static double convertLength(double value, String source_unit, String targetUnit) {
        String[] units = {"cm", "in", "ft", "yd", "m", "mi"};
        double[] conversion_factors = {0.01, 0.0254, 0.3048, 0.9144, 1, 1609.34};

        int source_index = index_of(units, source_unit);
        int target_index = index_of(units, targetUnit);

        if (source_index != -1 && target_index != -1) {
            double meters = value * conversion_factors[source_index];
            return meters / conversion_factors[target_index];
        } else {
            return -1;
        }
    }

    private static double convertVolume(double value, String source_unit, String targetUnit) {
        String[] units = {"l", "gal"};
        double[] conversion_factors = {1, 0.264172};

        int source_index = index_of(units, source_unit);
        int target_index = index_of(units, targetUnit);

        if (source_index != -1 && target_index != -1) {
            double liters = value * conversion_factors[source_index];
            return liters / conversion_factors[target_index];
        } else {
            return -1;
        }
    }

    private static int index_of(String[] array, String unit) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(unit)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean is_length(String unit) {
        String[] lengthUnits = {"cm", "in", "ft", "yd", "m", "mi"};
        for (String lengthUnit : lengthUnits) {
            if (lengthUnit.equals(unit)) {
                return true;
            }
        }
        return false;
    }

    private static boolean is_volume(String unit) {
        String[] volumeUnits = {"l", "gal"};
        for (String volumeUnit : volumeUnits) {
            if (volumeUnit.equals(unit)) {
                return true;
            }
        }
        return false;
    }
}
