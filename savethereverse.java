public class savethereverse {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        int last_dig;
        while(n>0){
            last_dig = n % 10;
            rev = (rev * 10) + last_dig;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
