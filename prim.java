    import java.util.Scanner;

public class prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        sc.close();
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Check if isPrime is still true after the loop
        if (isPrime && n>1) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
