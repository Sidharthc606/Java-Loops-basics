import java.util.Scanner;

public class displayallexceptten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;true;){
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
            sc.close();
        }
        
    }
}
//use do while loop better for it
