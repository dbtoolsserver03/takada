
// JAVA的包，就是JAVA文件在磁盘上所存放的位置
package com.jingdong.bank.basic;

//.java文件是给人看的。
//.class文件是将.java文件进行编译，编译成二进制的代码

// 规约 类名的首字线要大写
class Test02 {

}

// public的类名和文件名一定要一致
// 一个JAVA类文件里有且只能有一个public的类

/**
 * test class 测试
 */
 public class Test {

    /**
     * 程序入口
     * @param args
     */

     // static 当程序执行前 会加载到全局区
     // void 方法的返回值
     // main 程序的执行入口
     // String[] 方法参数的类型  字符串数组
     // args 参数变量名
    public static void main(String[] args) {

        // 1.syso
        // 2.alt + / 或者   ctrl + space

        // JAVA 注释
        // 双斜线 ： 单行注释

        /*
           多行注释
           hello
           world

         */

        // 给代码加注释的快捷键
        // 1.先中想要注释掉的代码
        // 2.ctrl + shift + c
//		aaa
//		bbb
        System.out.println("hello world");
    }
}
