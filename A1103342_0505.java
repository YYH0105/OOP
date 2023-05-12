import java.util.*;

class ValueException extends Exception{
    ValueException(String message){
        super (message);
    }
}

public class A1103342_0505{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] lottery = {1,2,3,4,5,6};
        int[] user = new int[6];

        for(int i = 0; i <= 5; i++){
            try{
                System.out.println("輸入第" +(i+1)+ "個號碼:");
                int n = input.nextInt();
                if(n < 1 || n > 49){
                    throw new ValueException("輸入1~49的數字");
                }
                user[i] = n;
            }catch(ValueException e){
                System.out.println("輸入錯誤:"+e);
                i--;
            }
        }
        System.out.println(Arrays.toString(user));

        int a=0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(lottery[j] == user[i]){
                    a=a+1;
                }
            }
        }
        if(a==6){
            System.out.println("中獎");
        }else{
            System.out.println("沒中獎");
        }
    }
}