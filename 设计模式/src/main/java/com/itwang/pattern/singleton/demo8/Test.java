package com.itwang.pattern.singleton.demo8;

import java.io.*;

/**
 * @Author: ww
 * @DateTime: 2022/4/11 17:55
 * @Description: 测试使用序列化反序列化破坏单例模式
 */
public class Test {
    public static void main(String[] args) throws Exception {
       // writeObject2File();
        readObjectFromFile();
    }

    // 从文件中取数据(对象)
    public static void readObjectFromFile() throws Exception {
        // 1.创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\workspace\\1.txt"));
        // 2.读取对象
        Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
        // 3.释放资源
        ois.close();
    }

    // 向文件中写数据(对象)
    public static void writeObject2File() throws Exception{
        // 1.获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2.创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\workspace\\1.txt"));
        // 3.写对象
        oos.writeObject(instance);
        // 4.释放资源
        oos.close();
    }
}
