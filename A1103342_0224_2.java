import java.util.Scanner;
public class A1103342_0224_2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        float tempC;
        System.out.print("輸入攝氏溫度:");
        tempC = input.nextFloat();
        float tempF;
        tempF=(tempC*9/5) + 32;
        System.out.printf("華氏溫度為 %.2f",tempF);
    }
}