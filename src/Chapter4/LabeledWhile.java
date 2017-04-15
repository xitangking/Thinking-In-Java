package Chapter4;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java -- While loops with "labeled break" and "labeled continue"
 * 丁酉鸡年三月 2017/04/14 20:53
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

public class LabeledWhile {

    public static void main(String[] args)
    {
        int i = 0;
        outer:
        while(true)
        {
            println("Outer while loop");
            while(true)
            {
                i++;
                println("i = " + i);
                if(i == 1){
                    println("continue");
                    continue ;
                }
                if(i == 3){
                    println("continue outer");
                    continue outer;
                }
                if(i == 5) {
                    println("break");
                    break;
                }
                if(i == 7){
                    println("break outer");
                    break outer;
                }
            }
        }
    }
}
