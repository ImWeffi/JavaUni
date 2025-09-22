import java.util.Scanner;
public class Main3uzd2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a:");
        int a = input.nextInt();
        System.out.print("b:");
        int b = input.nextInt();

        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }else {
                b = b%a;
            }
        }
        System.out.println("result:" + (a+b));
        input.close();
    }
}
