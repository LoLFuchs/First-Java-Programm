# Java Math
This is my very first Java programm ever made. 

## How it works
Its very simple, it just calculates for you.

It will ask you for 2 Numbers you have to enter.
Then it asks for an Operation like + - / *

## Code 



### Ask for the inputs 
``` 
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);

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
```

### calc and return result

```
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
```