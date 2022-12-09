package task3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Введіть назву товару");
            String P = input.next();
            String P1 = input.next();
            System.out.println("Введіть назву магазину");
            String S = input.next();
            String S1 = input.next();
            System.out.println("Введіть вартість товару у гривнях");
            int C = input.nextInt();
            int C1 = input.nextInt();
            Price[] price = {new Price(P, S, C), new Price(P1, S1, C1)};
             try {
                     if (S == null | S1 == null ) {
                             throw new Exception() ;
                     }
             Arrays.sort(price);
             System.out.println(Arrays.toString(price));
            }catch (Exception e ){
                    System.out.println(e.getMessage() );
            }


    }
}
