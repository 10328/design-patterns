package com.design.结构型.装饰器模式;


import java.io.*;

/**
 * @Classname FileTest
 * @Description 装饰器模式的实例
 * @Date 2021/5/1 17:34
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/com/design/结构型/装饰器模式/chickenSoup.txt");
        InputStream inputStream = new FileInputStream(file);
        BufferedInputStream bin = new BufferedInputStream(inputStream);
        byte[] data = new byte[1024];
        int byteRead = 0;
        while ((byteRead = bin.read(data)) != -1) {
            String ctn = new String(data, 0, byteRead);
            System.out.println(ctn);
        }
    }
}
