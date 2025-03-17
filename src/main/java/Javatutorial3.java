import java.awt.*;

class Javatt3{
        int x;
        int y;
}
public class javatt3 {
        public static void main (String[] args) {
            Point m = new Point();
            m.x=1000;
            calc(m);
            getValue(m);
            System.out.printf("%d",m.y);
        }
        static void clac(Point s){
            s.x /= 10;
        }
        static void getValue(Point p){
            p.y = p.x;
        }
}
