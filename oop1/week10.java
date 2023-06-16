public class week10 {
    public static void main(String args[]) throws Exception {
        
        String a = new String("物件導向程式設計");
        String b = "物件導向程式設計";

        char[] d = {'物', '件', '導', '向', '程', '式', '設', '計'};
        String c = new String(d, 4, 3);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a.equals(b)) {
            System.out.println("一樣");
        } else {
            System.out.println("不一樣");
        }

        System.out.println(b.contains("導向"));

        char [] e = new char[4];
        a.getChars(3, 7, e, 0);
        System.out.println(e[3]);
        //System.out.println(new String(e));

        //String f = "";
        //System.out.println(b.replace('式', '序'));
        //System.out.println(b.substring(2));
        StringBuffer test = new StringBuffer(a);
        // test.append(b);
        // System.out.println(test);
        test.insert(2, b);
        System.out.println(test);
        test.reverse();
        System.out.println(test);

        String g = "P122437120";
        System.out.println(g.matches("[a-zA-Z]{1}[1, 2]{1}[0-9]{8}"));

        String h = "(0912)310999";
        System.out.println(h.matches("[(]{1}[0][9]{1}[0-9]{2}[)]{1}[0-9]{6}"));
    }
}
