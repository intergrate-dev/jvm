package com.yunfu.leaf.vm.scapeAnalysis;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 逃逸分析： 逃域分析（jvm 性能优化技术，分析出对象的作用域，比如在方法体内部就是没有逃逸）找出未发生逃逸的对象，把这些对象在栈上分配。
 * @date: 2018-12-14
 * @time: 20:20
 */
public class ScapeAnalysis {

    public ScapeAnalysis obj;

    /**
     * 方法返回对象 ScapeAnalysis 放生逃逸
     *
     * @return
     */
    public ScapeAnalysis getInstance() {
        return obj == null ? new ScapeAnalysis() : obj;
    }

    /**
     * 为成员变量赋值，发生逃逸
     */
    public void setObj() {
        this.obj = new ScapeAnalysis();
    }

    /**
     * 对象的作用域仅在当前方法有效，没有逃狱
     */
    public void useObj() {
        ScapeAnalysis obj = new ScapeAnalysis();
    }

    /**
     * 引用成员变量的值，发生了逃狱
     *
     * @return
     */
    public void getInstance2() {
        ScapeAnalysis instance = getInstance();
    }
}
