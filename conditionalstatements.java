import java.util.Scanner;

public class conditionalstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt() ;
        if(age>=18){
            System.out.println("Eligible for voting and driving");

        }else if(age > 13 && age <18){
            System.out.println("Teenager");
        }else{
            System.out.println("Not Adult");
        }
        
    }
    
}
