import java.util.ArrayList;
import java.util.List;

public class Kaczmarski_K300 {
    public static void main(String[] args) {
        int kwota = 1026;
        System.out.println(bankomat.rozjebondo(kwota));
    }
}
class bankomat {
    static int[] nominaly = {500, 300, 100, 50, 30, 10, 5, 3, 1};
    static List<String> liczniki = new ArrayList<>();
    public static List<String> rozjebondo(int kwota){
        int n = 0;
        for (int i = 0; i < nominaly.length; i++) {
            n=0;
            while (kwota >= nominaly[i]) {
                kwota = kwota - nominaly[i];
                n = n+1;
            }
            liczniki.add("" + nominaly[i] + "z³:  " + n +" razy");
        }
        return liczniki;
    }

}
