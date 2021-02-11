package com.JayWang.itheima_01;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        //第一个构造函数
        File f1 = new File("D:\\Desktop\\HTML+CSS");
        System.out.println(f1);
        //第二个构造函数
        File f2 = new File("D:\\Desktop","HTML+CSS");
    }
}
