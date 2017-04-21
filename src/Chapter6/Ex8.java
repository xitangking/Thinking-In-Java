package Chapter6;

import org.jetbrains.annotations.Nullable;

import java.sql.Connection;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java
 * 丁酉鸡年三月 2017/04/21 19:27
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/




class ConnectionManager{


    static class Connection{
        Connection(){
            println("connect...");
        }
    }

    private static int i = 0;
    private static Connection[] connections = new Connection[]{new Connection(),new Connection()};

    @Nullable
    static Connection getConnection()
    {
        if(i >= 10)
            return null;
        else
            return connections[i++];
    }

}

public class Ex8 {

    public static void main(String[] args){
        ConnectionManager.getConnection();
    }

}
