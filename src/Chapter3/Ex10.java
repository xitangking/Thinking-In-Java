package Chapter3;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/14 19:34
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/
public class Ex10 {

    public static void main(String[] args)
    {
        int i = 0xA;
        int j = 0x5;
        println("i : " + Integer.toBinaryString(i));
        println("j :  " + Integer.toBinaryString(j));

        println("i | j : " + Integer.toBinaryString((i | j)));
        println("i & j : " + Integer.toBinaryString((i & j)));
        println("i ^ j : " + Integer.toBinaryString((i ^ j)));
        println("~j : " + Integer.toBinaryString((~j)));
    }
}
