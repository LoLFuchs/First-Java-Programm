import java.util.Scanner;

public class Main {

    public int math(int a, int b, String op) {
        Integer End = 0;
        switch (op) {
            case "+":
                End = a + b;
                break;
            case "-":
                End = a - b;
                break;
            case "/":
                End = a / b;
                break;
            case "*":
                End = a * b;
                break;
            default:
                System.out.println("Wrong Operation");
                break;
        }
        return End;
    }

    public static void main(String[] args) {
        try (Scanner newObj = new Scanner(System.in)) {
            System.out.println("enter number 1");
            Integer ZahlEins = newObj.nextInt();

            System.out.println("enter number 2");
            Integer ZahlZwei = newObj.nextInt();

            System.out.println("enter operation (+ - / *)");
            String Operation = newObj.next();

            Main obj = new Main();
            Integer result = obj.math(ZahlEins, ZahlZwei, Operation);
            System.out.println("Result: " + result);
        }
    }
}