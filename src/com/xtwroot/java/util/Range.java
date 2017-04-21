package com.xtwroot.java.util;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java -- Array creation methods that can be used without qualifiers,using java SE5 static import:
 * 丁酉鸡年三月 2017/04/20 21:25
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/

public class Range {

    // Produce a sequence [0,n)
    public static int[] range(int n){
        int[] result = new int[n];
        for(int i = 0;i < n;++i){
            result[i] = i;
        }
        return result;
    }

    // Produce a sequence [start...end)
    public static int[] range(int start,int end){
        int sz = end - start;
        int[] result = new int[sz];
        for(int i = 0;i < sz;++i){
            result[i] = start + i;
        }
        return result;
    }

    // Produce a sequence [start...end) incrementing by step
    public static int[] range(int start,int end,int step){
        int sz = (end - start) / step;
        int result[] = new int[sz];
        for(int i = 0;i < sz;++i){
            result[i] = start + (i * step);
        }
        return result;
    }
}
