package com.wl.ioTest;

import java.io.ObjectInputStream;

/**
 * @program: java-io
 * @description: 递归求阶乘
 * @author: wanglin
 * @create: 2021-11-16 13:49
 **/
public class RecursionFactorial {
    public static void main(String[] args) {
        int res = getFactorial(5);
        System.out.println(res);
    }

    private static int getFactorial(int num) {
        // 1的阶乘为1
        if (num == 1) {
            return 1;
        }
        // n不为1时，方法返回 n! = n*(n-1)! 递归调用getValue方法
        return num * getFactorial(num - 1);
    }
}
