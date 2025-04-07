import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        String result = (a+b).toLowerCase().replaceAll(" ","");
        System.out.println(result);

        s.close();

    }
}
