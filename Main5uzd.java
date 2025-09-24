import  java.util.Scanner;

public class Main5uzd {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("length of array a: ");
          int a = input.nextInt();
          int [] newA = new int[a];
          System.out.println("input items: ");
          for(int i = 0; i < a; i++){
              newA[i] = input.nextInt();
          }
          System.out.print("length of array b: ");
          int b = input.nextInt();
          int [] newB = new int[b];
          System.out.println("input items: ");
          for(int i = 0; i < b; i++){
              newB[i] = input.nextInt();
          }

          System.out.println("Array a: ");
          for(int num : newA){
              System.out.println(num + " ");
          }

          System.out.println("Array b: ");
          for(int num : newB){
              System.out.println(num + " ");
          }

          boolean aSorted = true;
          boolean bSorted = true;

          for(int i = 0; i < newA.length - 1; i++){
              if(newA[i] > newA[i +1]){
                  aSorted = false;
                  break;
              }
          }
            for(int i = 0; i < newB.length - 1; i++){
                if(newB[i] > newB[i +1]){
                    bSorted = false;
                    break;
                }
            }

            if(!aSorted || !bSorted){
            System.out.println("invalid input data");
            return;
          }

            int [] c = new int[newA.length +newB.length];
            int i = 0;
            int j = 0;
            int k = 0;

            while(i < newA.length && j < newB.length){
                if(newA[i] <= newB[j]){
                 c[k++] = newA[i++];
                }else{
                    c[k++] = newB[j++];
                }
            }
            while(j < newB.length){
                c[k++] = newB[j++];
            }

            while(i < newA.length){
                c[k++] = newA[i++];
            }
            System.out.println("reuslt:");
            for(int num : c){
                System.out.print(num + " ");
            }
    }
}
