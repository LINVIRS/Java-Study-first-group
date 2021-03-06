package com.wl.ioTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.chrono.MinguoChronology;

/**
 * @program: java-io
 * @description: 数据追加读写
 * @author: wanglin
 * @create: 2021-11-16 15:14
 **/
public class DataAppend {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream(PathConstant.ABSOLUTE_PATH+"IoTest/fos.txt", true);
        // 字符串转换为字节数组
        byte[] b = "abc3121de".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
