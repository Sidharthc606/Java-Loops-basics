import java.util.Scanner;

public class sumofnnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum,i;
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        sc.close();
        sum = 0;
        i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
