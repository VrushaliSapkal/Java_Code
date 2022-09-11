import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans=0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ans = (a*b)/(a+b);
        System.out.println(ans);

    } 
        
    
    
}
