import java.util.*;
import java.security.SecureRandom;

class TimerThread extends Thread{
    Eat e;
    String name;
    Random random;

    public TimerThread(Eat e,String name){
        this.e=e;
        this.name=name;
        this.random=new Random();
    }

    public void run(){
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(41) + 10;
        int type = random.nextInt(3);
        e.eat(name, num, type);
    }
}
class Eat{
    int pork=5000;
    int beef=3000;
    int vegetable=1000;
    boolean isSoldOut = false;
    public synchronized void eat(String eater,int num,int type){
        if(isSoldOut){
            return;
        }
        switch(type){
            case 0:
                if(num <= pork){
                    pork -= num;
                    System.out.println(eater + " 點了豬肉 " + num + " 顆");
                }
                break;
            case 1:
                if(num <= beef){
                    beef -= num;
                    System.out.println(eater + " 點了牛肉 " + num + " 顆");
                }
                break;
            case 2:
                if(num <= vegetable){
                    vegetable -= num;
                    System.out.println(eater + " 點了蔬菜 " + num + " 顆");
                    
                }
                break;
            default:
                break;
        }
        System.out.println("還剩下"+pork+"顆豬肉水餃, "+beef+"顆牛肉水餃, "+vegetable+"顆蔬菜水餃");
        if(pork <= 10 && beef <= 10 && vegetable <= 10){
            System.out.println("完售");
            isSoldOut = true;
            System.exit(0);
        }

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void startEat(int customer){
        for(int i=1;i<=customer;i++){
            TimerThread eater= new TimerThread(this,"eater"+i);     
            eater.start();
        }
    }
}

public class A1103342_0512{
    public static void main(String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Eat e = new Eat();
        System.out.print("輸入同時的顧客數: ");
        int customer=input.nextInt();
        e.startEat(customer);
    }
}