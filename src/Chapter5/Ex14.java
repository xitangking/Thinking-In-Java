package Chapter5;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/21 11:54
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

class RenLei{
    private static String wenming = "wenming";
    private static String juzhen;
    static{
        juzhen = "juzhen";
    }

    static void r()
    {
        println(wenming);
        println(juzhen);
    }

}

public class Ex14 {

    static RenLei renLei = new RenLei();

    public static void main(String[] args){
        //RenLei.r();
    }

}
