import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,last_num;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();
        for (; n > 0; ) {
            last_num = n % 10;
            n = n/10;
            System.out.print(last_num + " ");
        }
        System.out.println();
    }
}
