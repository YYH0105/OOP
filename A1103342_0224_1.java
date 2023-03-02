import java.util.Scanner;
public class A1103342_0224_1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("輸入一個整數:");
        number = input.nextInt();

        if(number % 2 == 1){
            System.out.printf("是奇數",number);
        }
        else{
            System.out.printf("是偶數",number);
        }
    }
}