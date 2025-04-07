import java.util.Scanner;

public class Code05_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num < 100) {
            System.out.println("100보다 작군요.");
        } else {
            System.out.println("100보다 크군요.");

        }
    }
}
