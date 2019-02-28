package com.yunfu.leaf.vm.jconsole;

import com.yunfu.leaf.vm.model.OOMObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2018-09-07
 * @time: 21:17
 */
public class JConsoleTest {

    // 为了防止垃圾回收
    public byte[] b = new byte[128 * 1024];

//    public JConsoleTest() {
//        byte[] b = new byte[128 * 1024];
//    }

    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("start...");
        fill(1000);
    }

    public static void fill(int n) {
        List<JConsoleTest> list = new ArrayList<JConsoleTest>();

        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new JConsoleTest());
        }
    }


}
