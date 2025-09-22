import java.util.Scanner;

public class Main3uzd1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("from:");
            double x = input.nextDouble();
            System.out.print("to:");
            double y = input.nextDouble();
            System.out.print("step:");
            double z = input.nextDouble();

            while (x <= y+z/2) {
                if (x < 1) {
                    System.out.printf("%.2f\tnot defined%n", x);
                } else {
                    System.out.printf("%.2f\t%.2f%n", x, (x*x+(2*x*1)+1)/Math.sqrt(x-1));
                }
                x = x+z;
            }
        }catch (Exception e){
            System.out.println("input-output error");
        }
    }
}
