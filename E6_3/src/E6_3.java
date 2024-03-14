import java.util.ArrayList;

//Write programs that read a line of input as a string and print
//
//a.Only the uppercase letters in the string.
//
//b.Every second letter of the string.
//
//        c.The string, with all vowels replaced by an underscore.
//
//d.The number of vowels in the string.
//
//e.The positions of all vowels in the string.
public class E6_3 {
    private void only_up(String x){
        for (char j:x.toCharArray()){
            if (Character.isUpperCase(j)){ System.out.print(j);}
        }
        System.out.println();
    }
    private void second(String x){
        System.out.println(x.toCharArray()[1]);
    }
    private void vowel_replaced(String x){
        char[] chara = x.toCharArray();
        for (int i=0;i<chara.length;i++){
            chara[i] = ("aeiouAEIOU".indexOf(chara[i]) != -1) ?'_' : chara[i];
        }
        System.out.println(chara);
    }
    private void number_vowels(String x){
        int sum = 0;
        for (char j:x.toCharArray()){
            sum = ("aeiouAEIOU".indexOf(j) != -1) ? sum+1 : sum;
        }
        System.out.println(sum);
    }
    private void pos_vowel(String x){
        ArrayList<Integer> arraya = new ArrayList<Integer>();
        for (int i=0;i<x.toCharArray().length;i++){
            if ("aeiouAEIOU".indexOf(x.toCharArray()[i]) != -1){
                arraya.add(i+1);
            }
        }
        System.out.println(arraya);
    }
    public static void main(String[] args) {
        E6_3 x = new E6_3();
        x.only_up("HEllO");
        x.second("HELLO");
        x.vowel_replaced("HELLO");
        x.number_vowels("HELLO");
        x.pos_vowel("HELLO");
    }
}
