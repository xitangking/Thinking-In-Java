package Chapter4;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java -- For loops with "labeled break" and "labeled continue"
 * 丁酉鸡年三月 2017/04/14 20:34
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

/**
 *  带标签的continue和break是用来在多重循环的情况下选择continue或break出哪一层循环的
 **/

public class LabeledFor {
    public static void main(String[] args)
    {
        int i = 0;
        outer: // Can't have statements here
        for(;true;)
        {
            inner:// Can't have statements here
            for(;i < 10;i++)
            {
                println("i = " + i);
                if(i == 2)
                {
                    println("continue");
                    continue ;
                }
                if(i == 3)
                {
                    println("break");
                    i++;
                    break;
                }
                if(i == 7)
                {
                    println("continue outer");
                    i++;
                    continue outer;
                }
                if(i == 8)
                {
                    println("break outer");
                    break outer;
                }
                for(int k = 0;k < 5;k++)
                {
                    if(k == 3)
                    {
                        println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Can't break or continue to labels here
    }
}

























