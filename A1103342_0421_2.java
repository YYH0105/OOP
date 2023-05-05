import java.util.*;

public class A1103342_0421_2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("輸入日期(格式為 YYYY/MM/DD 或 MM/DD/YYYY)");
        String Date = input.next();
        if(Date.matches("[0-9]{4}[/]{1}[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}") || Date.matches("[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}[0-9]{4}")){
            System.out.printf("輸入的日期為\"%s\"",Date);
        }else{
            System.out.println("格式錯誤！");
        }
    }
}