package Chapter4;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/14 19:50
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/
public class Ex5 {

    public static void main(String[] args)
    {
        int i = 0xA;
        int j = 0x5;
        printBinary(i);
        println("");
        printBinary(j);
        println("");
        println("i : " + BinaryString(i));
        println("j :  " + BinaryString(j));
        println("i | j : " + BinaryString((i | j)));
        println("i & j : " + BinaryString((i & j)));
        println("i ^ j : " + BinaryString((i ^ j)));
        println("~j : " + BinaryString((~j)));
    }

    static String BinaryString(int i)
    {
        String s = "";
        for(int j = 0;j < 32;j++)
        {
            if((i & (1 << j)) == 0)
                s ="0" + s;
            else
                s ="1" + s;
        }
        return s;
    }

    static void printBinary(int i)
    {
        while(i != 0)
        {
            print((((i = i >> 1) ^ 1) == 0) ? "0" : "1");
        }
    }

}
