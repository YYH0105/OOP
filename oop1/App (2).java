class TimerThread extends Thread {
    //public synchronized void run() {
        // for (int i = 0; i < 1000; i++) {
        //     System.out.println("我是執行緒" + this.getName() + "i =" + i);
        //     try {
        //         // this.sleep(500);
        //         // System.out.println(this.getName() + "睡覺中");

                
        //         if (i == 10) {
        //             this.wait();               
        //         }
        //         this.notify();
        //     } catch(InterruptedException e) {

        //     }   
        //}
    //}           
    Eat e;
    String name;
    TimerThread(Eat e, String name) {
        this.e = e;
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            e.eat();
        }
    }
}

class Eat {
    int j = 1000;
    public synchronized void eat() {
        if (j <= 0) {
            System.out.println("水餃吃完了");
            System.exit(0);
        } else {
            j -= 1;
            System.out.println(j);
        }
    }
    public void startEat() {
        TimerThread eater1 = new TimerThread(this, "eater1");
        eater1.start();
        TimerThread eater2 = new TimerThread(this, "eater2");
        eater2.start();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // TimerThread ThreadA = new TimerThread();
        // ThreadA.start();
        // TimerThread ThreadB = new TimerThread();
        // ThreadB.start();
        // TimerThread ThreadC = new TimerThread();
        // ThreadC.start();
        Eat e = new Eat();
        e.startEat();
    }
}
