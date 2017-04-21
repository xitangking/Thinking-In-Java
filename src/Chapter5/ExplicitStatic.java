package Chapter5;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java -- Explicit static initialization with the "static" clause
 * 丁酉鸡年三月 2017/04/21 11:19
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

class Cup{

    Cup(int marker){
        println("Cup(" + marker + ")");
    }

    void f(int marker){
        println("f(" + marker + ")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static{
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups(){
        println("Cups()");
    }
}

public class ExplicitStatic {

    public static void main(String[] args){
        println("Inside main()");
        //Cups.cup1.f(99); // (1)
    }

    static Cups cups1 = new Cups(); // (2)
    //static Cups cups2 = new Cups();
}
