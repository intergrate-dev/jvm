package com.yunfu.leaf.vm.oom;

import com.yunfu.leaf.vm.model.OOMObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * VM Args: -Xms20m _Xmx20m (堆的最大最小值 20 MB，不可扩展) -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 堆溢出测试
 * @date: 2018-09-06
 * @time: 23:18
 */
public class HeapOOM {


    public static void main(String[] args) {
//        List<OOMObject> list = new ArrayList<>();
//        while (true) {
//            list.add(new OOMObject());
//        }
        Scanner scanner =new Scanner(System.in);
        String next = scanner.next();
        System.out.println("next: "+next);
    }

}
