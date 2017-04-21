package Chapter6;

import com.xtwroot.java.util.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/21 16:30
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

class Permission{

    public String Public;
    protected String Protected;
    private String Private;

    public void pub() {

    }

    protected void pro(){

    }

    private void pri(){

    }

}

public class Ex5 extends Permission {

    void f(){
        Public = "public";
        Protected = "protected";
        //Private = "private";
        super.pub();
        super.pro();
        //super.pri();
    }

}
