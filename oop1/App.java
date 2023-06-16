interface Itest{
    // void show() {
    //     Ssyetm.out.println("Hello interface");
    // }//(X)
    void show2(int a, int b);//(O)
}
class Interclass implements Itest {
    public void show2(int a, int b) {
        System.out.println(a + b);
    }
}



abstract class Test {
//無法產生物件
    abstract public void show();
}

class Newtest extends Test implements Itest {
    //需繼承才能使用物件，但若繼承後仍無程式碼仍無法產生物件
    // int i = 1;
    // public void show() {
    //     System.out.print(i);
    //}
    public void show() {
        int i = 1;
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        //Test test1 = new Test();
        Newtest test1 = new Newtest();
        test1.show();
        System.out.println("Hello, World!");
    }
}
