package com.itwang.pattern.flyweight.jdk;

/**
 * @Author: ww
 * @DateTime: 2022/4/16 18:47
 * @Description: TODO
 */
public class demo1 {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println("i1和i2对象是否是同一个对象？" + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i3和i4对象是否是同一个对象？" + (i3 == i4));
    }
}
