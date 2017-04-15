package Chapter4;

import static com.xtwroot.java.util.Print.*;

/********************************************************************************
 * Thinking In Java -- 吸血鬼数字
 * 丁酉鸡年三月 2017/04/14 22:07
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/
public class Ex10 {
    public static void main(String[] args)
    {
        String numright;
        String numletf;
        char[] s;

        for (int i = 1000; i < 10000; i++) {
            s = ("" + i).toCharArray();
            for(int m = 0;m < 4;m++)
            {
                for(int n = 0;n < 4;n++)
                {
                    if(m == n || m == 0)
                        continue;
                    numletf = "" + s[m] + s[n];s[n] = ' ';s[m] = ' ';
                    numright =("" + s[0] + s[1] + s[2] + s[3]).replace(" ","");

                    if(i == string_int(numletf) * string_int(numright))
                        println(i + " = " + numletf + " * " + numright);
                    else if(i == string_int(numright) * string_int(numletf))
                        println(i + " = " + numright + " * " + numletf);
                    s = ("" + i).toCharArray();
                }
            }
        }
    }

    static int string_int(String s)
    {
        int i = 0;
        for (char c:s.toCharArray()) {
            switch (c)
            {
                case '1': i = i * 10 + 1;break;
                case '2': i = i * 10 + 2;break;
                case '3': i = i * 10 + 3;break;
                case '4': i = i * 10 + 4;break;
                case '5': i = i * 10 + 5;break;
                case '6': i = i * 10 + 6;break;
                case '7': i = i * 10 + 7;break;
                case '8': i = i * 10 + 8;break;
                case '9': i = i * 10 + 9;break;
                case '0': i = i * 10 + 0;break;
            }
        }
        return i;
    }
}
