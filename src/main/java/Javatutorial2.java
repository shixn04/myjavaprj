public class Javatutorial2 {

        public static void main(String[] args ) {
            int result=0;
            for(int i=1; i<10 ; i++) {
                    if(i%3==0 && i%2!=0)
                            result=result + i;
            }
            System.out.print(result);
        }
}
