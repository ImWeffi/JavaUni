import java.util.Scanner;
public class Main2uzd {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
        double x = input.nextDouble();
        double y = input.nextDouble();
i
            boolean redUp = x >= 3 && x <= 7 && y>=6 && y < 7;
            boolean redDown = x >= 3 && x <= 7 && y >= 3 && y <= 4;
            boolean redRight = x >= 6 && x <= 7 && y >= 3 && y < 7;
            boolean redLeft = x >= 3 && x <= 4 && y >= 3 && y < 7;

            boolean blue = y >= 7 && y <= x + 5 && y <= -x + 15;
            boolean green = (x - 5) * (x - 5) + (y - 8) * (y - 8) < 1;

            boolean red = redUp || redDown || redRight || redLeft;

            if (red) {
                System.out.println("red");
            } else if (green) {
                System.out.println("green");
            } else if (blue) {
                System.out.println("blue");
            } else {
                System.out.println("white");
            }
        }catch (Exception ex){
            System.out.println("input-output error");
            input.close();
        }
    }
