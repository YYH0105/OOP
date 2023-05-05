import java.util.*;

public class A1103342_0421_1{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("輸入電子信箱：");
        String Email = input.next();
        if(Email.matches("[a-z][@]+[a-z]+.[a-z]+.[a-z]+")){
            System.out.printf("格式正確！\n");
        }else{
            System.out.printf("格式錯誤！\n");
        }
    }
}