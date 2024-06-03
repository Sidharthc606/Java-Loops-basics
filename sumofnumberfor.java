import java.util.Scanner;

public class sumofnumberfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum = 0;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        sc.close();
        for(int i = 1; i<=n ;i++){
            sum += i;
        }
        System.out.println(sum);

    }
    
}
