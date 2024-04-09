import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int n = sec.nextInt();

        System.out.println(func(n));
    }
    public static int func(int n) {

        if (n == 1) {
            return 1;
        }
        return n * func(n - 1);
    }
}
