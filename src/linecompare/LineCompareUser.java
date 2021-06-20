package linecompare;

 import java.util.Scanner;

    public class LineCompareUser {
        public static void main(String []args) {

            System.out.println("Welcome to Line Computation");

            Scanner sc = new Scanner(System.in);
                                                           //Length as a point x1,x2,y2,y1

            System.out.println("Enter the value of X1 and X2");

            int x1=sc.nextInt();
            int x2=sc.nextInt();

            System.out.println("Enter the value of Y1 and Y2");

            int y1=sc.nextInt();
            int y2=sc.nextInt();

            double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(x2-x1));

            System.out.println("Length of Line: "+length);

        }
    }
