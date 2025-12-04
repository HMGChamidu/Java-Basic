import java.util.Scanner;
public class SumEvenNumbers {
  public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      int[] arr= new int[5];
       int Sum = 0;

       System.out.println("Enter 5 number: ");
       for(int i= 0;i<5;i++){
           arr[i] =sc.nextInt();

       }
        for (int i=0; i<5; i++){
            if(arr[i]%2 == 0){
                Sum +=arr[i];
            }
        }
      System.out.println("Sum of Even numbers= " +Sum);
  }
}
