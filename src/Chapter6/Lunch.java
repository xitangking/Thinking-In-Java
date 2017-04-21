package Chapter6;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java -- Demonstrates class access specifiers.Make a class effectively private constructors:
 * 丁酉鸡年三月 2017/04/21 19:19
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

class Soup1{
    private Soup1(){}
    // (1) Allow creation via static method:
    public static Soup1 makeSoup()
    {
        return new Soup1();
    }
}

class Soup2{
    private Soup2(){}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}

public class Lunch {

    void testPrivate(){
       //! Soup1 soup1 = new Soup1();
    }

    void testSingleton(){
        Soup2.access().f();
    }

    void testStatic(){
        Soup1 soup1 = Soup1.makeSoup();
    }

    public static void main(){

    }

}
