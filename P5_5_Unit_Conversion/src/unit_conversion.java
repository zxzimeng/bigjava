import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//P5.5Unit conversion. Write a unit conversion program that asks the users from
//which unit they want to convert (gal, lb, in, ft, mi)
//and to which unit they want to convert (l, g, kg, cm, m, km).
//
//Reject incompatible conversions (such as gal → km).
//Ask for the value to be converted, then display the result:
//
//Convert from? gal
//Convert to? ml
//Value? 2.5
//        2.5 gal = 9462.5 ml
public class unit_conversion {

    final ArrayList<String> imperial = new ArrayList<String>(Arrays.asList("in", "ft", "yd", "mi"));
    final ArrayList<String> metric = new ArrayList<String>(Arrays.asList("cm", "m", "km"));
    private int unitindex(String units){
        if (imperial.contains(units)){
            return 0;
        }
        return 1;
    }
    public double convert(int value, String units, String target) {
        ArrayList<ArrayList<String>> order = new ArrayList<ArrayList<String>>();

        ArrayList<ArrayList<Integer>> conversion = new ArrayList<ArrayList<Integer>>();
        final ArrayList<Integer> imperial_conv = new ArrayList<Integer>(Arrays.asList(0, 12, 3, 1760));
        final ArrayList<Integer> metric_conv = new ArrayList<Integer>(Arrays.asList(0, 100, 100));

        order.add(imperial);
        order.add(metric);

        conversion.add(imperial_conv);
        conversion.add(metric_conv);

        // convert all to lowest unit
        int whatunit = unitindex(units);
        double current_value = value;
        int current_unit = order.get(whatunit).indexOf(units);

        while (current_unit!=0){
            current_value*=conversion.get(whatunit).get(current_unit--);
        }

        //
    }

    public static void main() {

    }
}
