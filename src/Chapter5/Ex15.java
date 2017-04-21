package Chapter5;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/21 12:00
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

class Mug{

    String m;
    String n;
    {
        m = "humen";
        n = "being";
        println("m & n initialized");
    }

    Mug()
    {
        println("Mug initialized");
    }

}

public class Ex15 {

    public static void main(String[] args){
        new Mug();
    }

}
