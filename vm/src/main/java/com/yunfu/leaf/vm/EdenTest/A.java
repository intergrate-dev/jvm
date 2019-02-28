package com.yunfu.leaf.vm.EdenTest;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2018-12-13
 * @time: 15:44
 */
public class A {
    public static void main(String[] args) {
        // 声明 4 m 大的字节数组，通过参数 -verbose:gc -XX:+PrintGCDetails 日志打印看出虚拟机使用哪个垃圾回收
        // PSYoungGen 使用 Parallel 垃圾回收器
        // 通过指令指定用哪个回收器，-XX:+UseSerialGC，发现日志新生代名字变成  def new generation
        byte[] byte1 = new byte[2 * 1024 * 1024];
//        byte[] byte2 = new byte[2 * 1024 * 1024];
//        byte[] byte3 = new byte[2 * 1024 * 1024];
//        byte[] byte4 = new byte[4 * 1024 * 1024];

        System.gc();
    }
}
