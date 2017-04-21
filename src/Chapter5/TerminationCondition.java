package Chapter5;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java -- Using finalize() to detect an object that hasn't been properly cleaned up.
 * 丁酉鸡年三月 2017/04/20 22:49
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/
class Book{
    private boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    protected void finalize(){
        if(checkedOut)
            println("Error:checked out");
        // Normally,you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}

public class TerminationCondition {


    public static void main(String[] args){
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference.forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }

}
