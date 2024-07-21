package jp.co.saisk;

public class NumUtils {

    public static int getRet(int a, int b, String ch) {

        int ret = 0;
        if ("-".equals(ch)) {
            ret = a - b;
        } else if ("+".equals(ch)) {
            ret = a + b;
        }

        int aa=1;
        int bb=2;
        if(aa>bb) {
            System.out.println(123);
        }
        return ret;
    }



}
