import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        System.out.println("a " + a);
        System.out.println("b " + b);
        //System.out.println("Choice " + ch);

        switch(ch){
            case 1 : c = a+b;
                     System.out.println("Addition " + c);
                     break;
            case 2 : c = a-b;
                     System.out.println("Substraction " + c);
                     break;
            case 3 : c = a*b;
                     System.out.println("Multiplication " + c);
                     break;
            case 4 : c = a/b;
                     System.out.println("Division " + c);
                     break;
            case 5 : c = a%b;
                     System.out.println("Remainder " + c);
                     break;
            default : System.out.println("Invalid Choice");

        }
    }
}
