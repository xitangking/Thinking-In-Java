package Chapter5;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/20 21:40
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/
public class Ex8 {

    public static void main(String[] args)
    {
        Ex8 ex8 = new Ex8();
        ex8.test();
    }

    void test()
    {
        print();
        this.print();
    }

    void print()
    {
        println("Tongues");
    }

}
