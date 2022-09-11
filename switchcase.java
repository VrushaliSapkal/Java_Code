import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch(number){
            case 1 : System.out.println("Ordered Samosa");
            break;
            case 2 : System.out.println("Ordered Burger");
            break;
            case 3 : System.out.println("Ordered Mango Shake");
            break;
            default : System.out.println("We realised that we are dreaming such things");
        }
    }
    
}
