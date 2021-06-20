package linecompare;

public class LineCompare1 {
    public static void main(String args[]) {
        System.out.println("Welcome to Line comparison Computation");
        //Length as a point x1,x2,y2,y1
        int x1, x2, y1, y2;
        double dis;
        x1 = 1;
        y1 = 2;
        x2 = 2;
        y2 = 3;
        dis = Math.sqrt(x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")==" + dis);
    }
}
