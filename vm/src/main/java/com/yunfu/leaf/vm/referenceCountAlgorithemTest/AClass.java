package com.yunfu.leaf.vm.referenceCountAlgorithemTest;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 测试垃圾回收器是否使用引用计数算法来判断对象是否为垃圾回收对象，进行垃圾回收
 * @date: 2018-12-02
 * @time: 12:53
 */
public class AClass {
    private Object reference;

    public AClass() {
        // 其实就是声明对象的存储空间为 20M
        byte[] bytes = new byte[1024 * 1024 * 20];
    }

    public static void main(String[] args) {
        // 创建两个对象，栈中就会有一个引用指向堆，因此两个对象的引用为 1 。
        AClass a1 = new AClass();
        AClass a2 = new AClass();

        // 将两个对象相互引用，因此两个对象的引用为 2 。（只要产生引用，引用 + 1）
        a1.reference = a2;
        a2.reference = a1;

        // 将两个对象置 null
        a1=null;
        a2=null;

        // 进行系统垃圾回收，发现系统真的回收这两个对象，所以就没有采用引用计数算法，因为如果采用引用计数算法，对象的引用为 1 ，就不会被垃圾回收
        System.gc();
    }
}
