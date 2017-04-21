package Chapter5;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/20 21:46
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

class Finalize
{
    protected void finalize() {
        println("finalize...");
    }
}

public class Ex10 {


    public static void main(String[] args){

        Finalize finalize = new Finalize();
        finalize = null;
        new Finalize();
        new Finalize();
        new Finalize();
        new Finalize();
        System.runFinalization(); // 使用了这个函数还是需要调用System.gc();
        System.gc(); // 调试使执行的几率较大
    }
}
