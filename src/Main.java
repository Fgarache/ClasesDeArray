import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = { 13, 7, 6, 45, 21, 9, 101, 102 };

        int i;
        System.out.println("los datos   "  );
        for ( i = 0; i < 5; i++) {
            System.out.print("["+num[i]+"]");
        }

        System.out.println("\n****************************");
        for ( i = 0; i < 5; i++) {
            Arrays.sort(num);

            System.out.print("["+num[i]+"]");
        }

    }
}