import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        //part1
        // int[] a = {10, 20, 40, 80, 120};
        // for (int i = 0 ; i < a.length ; i++) {
        //     System.out.println(a[i]);
        //     System.out.write(a[i]);//轉ASCII用write
        //     System.out.println();
        // }

        // byte[] b = {7, 32, 7, 32, 7};
        // System.err.write(b, 0, b.length);//哪個陣列,哪個開始,結束
        
        //part2
        //System.out.println("please enter:");
        //part2-1字元
        // char ch = (char)System.in.read();
        //// String str = Character.toString(ch); 
        // System.out.println(ch);

        //part2-2字串
        // BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        // String str = br.readLine();
        // System.out.println(str);
//
        System.out.println("輸入檔案路徑:");
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String str = br.readLine();
        FileReader fr = new FileReader(str);

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char)ch);
        }
    }
}
