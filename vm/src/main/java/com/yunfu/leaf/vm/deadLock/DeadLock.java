package com.yunfu.leaf.vm.deadLock;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 死锁
 * @date: 2019-02-20
 * @time: 17:36
 */
public class DeadLock implements Runnable {
    // 资源一
    private Object obj1;
    // 资源二
    private Object obj2;

    public DeadLock(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    @Override
    public void run() {
        synchronized (obj1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            synchronized (obj2) {
                System.out.println("hello");
            }
        }
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        // obj 1 被锁住了
        new Thread(new DeadLock(obj1, obj2)).start();
        new Thread(new DeadLock(obj2, obj1)).start();
    }
}
