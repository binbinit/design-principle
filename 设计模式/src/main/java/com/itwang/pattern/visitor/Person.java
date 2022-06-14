package com.itwang.pattern.visitor;

/**
 * @Author: ww
 * @DateTime: 2022/4/18 20:31
 * @Description: 抽象访问者角色类
 */
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
