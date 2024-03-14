import java.util.ArrayList;

//Write programs that read a sequence of integer inputs and print
//
//a.The smallest and largest of the inputs.
//
//b.The number of even and odd inputs.
//
//c.Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19.
//
//d.All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6.
public class E6_2 {
    private void min_max(int[] x){
        int min = 2147483647;
        int max = 0;
        for (int j : x) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println(new int[]{min, max});
    }

    private void number_e_o(int[] x){
        int odd = 0;
        int even = 0;
        for (int j:x){
            even = j%2==0 ? even+1 : even ;
            odd = j%2==1 ? odd+1 : odd ;
        }
        System.out.println(new int[]{odd, even});
    }

    private void number_running(int[] x){
        ArrayList<Integer> return_l= new ArrayList<Integer>();
        int running_total = 0;
        for (int j:x){
            running_total+=j;
            return_l.add(running_total);
        }
        System.out.println(return_l);
    }

    private void adjacent_dupl(int[] x){
        ArrayList<Integer> return_l= new ArrayList<Integer>();
        for (int i=0;i<x.length;i++){
            int b = i;
            while (b+1<x.length&&x[b] == x[b+1]){
                if (b==i){
                    return_l.add(x[b]);
                }
                b++;
            }
            i=b;
        }
        System.out.println(return_l);
    }

    public static void main(String[] args) {
        E6_2 x = new E6_2();
        x.number_running(new int[]{1,7,2,9});
        x.adjacent_dupl(new int[]{1,3,3,4,5,5,6,6,6,2});
    }
}
