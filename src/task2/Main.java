package task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введіть прізвище та ініціали працівника у форматі Прізвище_І_І");
            String S = input.nextLine() ;
            String S1 = input.nextLine();
            String S2 = input.nextLine();
            String S3 = input.nextLine();
            String S4 = input.nextLine();
            System.out.println("Введіть назву посади ");
            String P = input.next();
            String P1 = input.next();
            String P2 = input.next();
            String P3 = input.next();
            String P4 = input.next();
            try {
            System.out.println("рік надходження на роботу");
            int A = input.nextInt( ) ;
            int A1 = input.nextInt();
            int A2 = input.nextInt();
            int A3 = input.nextInt() ;
            int A4 = input.nextInt() ;
            Worker[] workers = {new Worker(S, P, A), new Worker(S1, P1, A1), new Worker(S2, P2, A2),
                    new Worker(S3, P3, A3), new Worker(S4, P4, A4)};
            Arrays.sort(workers);
            System.out.println(Arrays.toString(workers));
        } catch (Exception  e){
          System.out.println(e.getMessage() );
       }






    }
}
