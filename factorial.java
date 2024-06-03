import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,fact = 1;
        System.out.print("enter the number: ");
        n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            fact*=i;
        }
        System.out.println("factorial: " + fact);
        sc.close();

    }
}
