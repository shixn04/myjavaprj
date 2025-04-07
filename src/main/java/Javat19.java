import java.util.Scanner;

public class Javat19 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        Scanner a =new Scanner(System.in);

        int num1;
        int num2;
        float result;

        num1=s.nextInt();
        System.out.println("사용자가 입력한 값==>" + num1);

        num2=a.nextInt();
        System.out.println("사용자가 입력한 값==>" + num2);

        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);

        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);

        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result);

        result = (float) num1/num2;
        System.out.println(num1 + "/" + num2 + "=" + result);

        result = num1 % num2;
        System.out.println(num1 + "%" + num2 + "=" + result);


        s.close();
     }
}
