import java.util.Scanner;

public class oneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter,n;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        counter = 1;
        sc.close();
        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
    }
}
