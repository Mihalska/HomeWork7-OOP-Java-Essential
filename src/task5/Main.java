package task5;

import java.util.Scanner;


public class Main {
    public static void  main(String[] args) {
        try {
        System.out.println("Введіть два числа");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Введіть знак арифметичної операції (+ - * /)");
        String sign = input.next();
        Calculator calculator = new Calculator(a, b);
        switch (sign) {
            case "+": {
                System.out.println(calculator.add());
                break;
            }
            case "-": {
                System.out.println(calculator.sub());
                break;
            }
            case "*": {
                System.out.println(calculator.mul());
                break;
            }
            case "/": {
                        System.out.println(calculator.div());
                        try {
                        if (b == 0)
                             throw new ArithmeticException();
                        } catch (ArithmeticException e) {
                        System.out.println(e );
                        }
                    break;

           }
        }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}

