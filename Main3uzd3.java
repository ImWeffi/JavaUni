import java.util.Scanner;
public class Main3uzd3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("input number: ");
        byte n = input.nextByte();

        int length = 0;
        for(int i = 7; i >= 0; i--){
            byte mask = (byte)(1 << i);

         if((n & mask) != 0){
            length++;
         }else {
             if (length > 0){
                 System.out.print(length + " ");
                 length = 0;
             }
         }
        }
        input.close();

        if(length > 0){
            System.out.print(length);
        }
    }
}
