import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n = sc.nextInt();
      int result;
      for(int i = 1 ; i<=10; i++){
        result = n*i;
        System.out.println(result);
      }
      sc.close();
    }
}
