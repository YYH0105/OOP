import flag.*; //"*"只有檔案，非整個目錄
import flag.flagchild.Circle;


class MyException extends Exception {
    MyException(String a) {
        super(a);
    }
}


public class App {
    public static void main(String args[]) throws Exception {
        Shape iShape = new Shape(10, 8);
        // flag.Shape iShape = new flag.Shape(10, 8);  no import
        System.out.println(iShape.toString());
        flag.flagchild.Circle iCircle = new flag.flagchild.Circle(); //no import 
        
        int a, b;
        a = 0;
        b = 1;
        // int iArray[] = {1, 2};

        // try {
        //     System.out.println(b / a);
        //     System.out.println(iArray[2]);
        // } catch (ArithmeticException e) {
        //     System.out.println("分母不可為0!");
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("超出陣列範圍!");
        // } finally {
        //     System.out.println("程式執行結束!");
        // }



        // if (b == 0) {
        //     throw new ArithmeticException("不可以為0");
        // }
        // System.out.println(a / b);


        try {
            if (b == 0) {
                throw new MyException("不可以為0");
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
