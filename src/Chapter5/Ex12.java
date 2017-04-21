package Chapter5;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/21 11:10
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

enum Status { fill,empty,midden}

class Tank{
    Status status = Status.fill;

    public void empty(){
        status = Status.empty;
    }

    public void fill(){
        status = Status.fill;
    }

    public void midden(){
        status = Status.midden;
    }

    @Override
    protected void finalize() throws Throwable {
        if(status != Status.empty)
            println("Error:Status isn't empty!");
    }
}

public class Ex12 {

    public static void main(String[] args){

        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        Tank tank3 = new Tank();
        tank1.empty();
        tank2.midden();
        tank1 = tank2 = tank3 = null;
        System.runFinalization();
        System.gc();

    }

}
