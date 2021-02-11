package com.JayWang.itheima_02;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) {
        //需求一： 创建文件
        File f1 = new File("D:\\Desktop\\java.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //需求二： 创建单目录
        File f2 = new File("D:\\Desktop\\JavaSE");
        f2.mkdir();
        //需求三： 创建多级目录
        File f3 = new File("D:\\Desktop\\JavaSE\\CSS");
        f3.mkdirs();
    }
}
