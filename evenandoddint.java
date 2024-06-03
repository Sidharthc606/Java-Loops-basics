import java.util.Scanner;

public class evenandoddint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,evensum = 0 , oddsum = 0;
        do{
            System.out.print("Enter the numbers: ");
            number = sc.nextInt();
            if (number == -1) {
                System.out.println("quit");
                break;
            }
    
             if (number % 2 == 0){
                evensum += number;
            }
            else {
                oddsum += number;
            }
        }while(true);
        System.out.println("even sum: " + evensum);
        System.out.println("odd sum: " + oddsum);
        sc.close();
     }
}
