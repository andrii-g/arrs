package arrays;

/**
 * Created by Андрей on 06.09.2017.
 */
public class Del {
    public static void main(String[] args) {
        double ar1[] = new double[100];


        for(int i = 3; i < ar1.length; i++) {
            ar1[i] = Math.floor(Math.random() * 10);
            System.out.print(ar1[i] + " ");
            i--;
            i--;
        }
    }
}
