package com.JayWang.itheima_03;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Desktop\\Java\\IdeaProjects\\myFile\\java.txt");
        f.createNewFile();
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.getPath());
        //删除
        f.delete();
    }
}
