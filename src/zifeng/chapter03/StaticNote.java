package zifeng.chapter03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *  static
 *  定义：一个类的主要组成就是属性和方法(构造方法和普通方法),每一个对象都分别拥有各自的属性内容（不同对象的属性保存在不同的堆内存找那个），
 *  如果类中的某个属性希望定义为公共属性（所有对象都可以使用的属性）,则可以在声明属性前加上static关键字。
 *
 *
 *
 *  static是公共属性的概念，利用static定义的属性是可以由类名称直接调用的
 *  类名称.属性 = 值；
 *
 *  static属性和非static属性的区别：
 *    所有的非static属性必须产生实例化对象才可以访问，但是static属性不受实例化对象的控制。在没有实例化对象的情况下，依然可以适用static修饰的属性。
 *
 *  什么时候使用statci定义属性
 *     优先考虑非static属性，只有在描述共享属性概念或者是不受实例化对象限制的属性时才会使用static定义属性，而大部分情况下依然使用非static属性。
 *
 *
 *  static定义的属性和方法都不受实例化对象的控制，属于独立类的功能。
 *  问题：此时类中的方法就变为static方法和非static方法两种。两组方法间的访问也将受到如下限制：
 *       static 方法不能直接访问非static属性或方法，只能调用static属性或方法。
 *       非static方法可以访问static的属性或方法，不受任何限制。
 *
 *  原因：所有的非static定义的结构，必须在类已经明确产生实例化对象时才会分配堆空间，才可以适用。
 *       所有的static定义的结构，不受实例化对象的控制，即可以在没有实例化对象的时候访问。
 *
 *
 *
 *
 *  主方法介绍：
 *    public: 主方法程序的开始，所以这个方法对任何操作都一定是可见的。
 *    static: 证明此方法由类名称调用；
 *    void：   主方法是一切执行的开始点，既然是所有的开头，就不能回头，直到执行完毕为止。
 *    main：   是一个系统规定好的方法名称，不能修改；
 *    String args[] : 指的程序运行时传递的参数，格式为：“java 类名称 参数 参数 参数”
 *
 *
 *   代码块
 *      如果一个代码块写在方法里，就称它为代码块
 *   构造块
 *      如果将一个代码块写在一个类里，这个代码块就称为构造块
 *      构造块在每一个实例化类对象时都会被调用，而且优于构造方法执行
 *   静态块
 *      如果一个代码块使用static进行定义，就称其为静态块。
 *      静态块分为两种情况使用：
 *         在非主类中使用：当有多个实例化对象产生时，静态块会优先调用，而且只调用一次。主要作用一般可以为static属性初始化。
 *         在主类中使用：静态块优于主方法执行。
 *
 *
 *
 *
 *
 *
 *  扩展知识：
 *     栈内存空间：保存所有的对象名称
 *     堆内存空间：保存每个对象的具体属性内容
 *     全局数据区：保存static类型的属性
 *     全局代码区：保存所有的方法定义
 *
 *
 */
public class StaticNote {
    public static void main(String[] args) {
        StaticBook books = new StaticBook("ba",10.5);
        StaticBook Ba = new StaticBook("AA" ,20.0);
        Ba.pub = "北京大学";
        String ABook = Ba.getInfo();
        System.out.println(ABook);
        StaticBook.pub = "复旦大学";
        System.out.println(Ba.getInfo());

    }

}
class StaticBook{
    private String title;
    private double price;
    static String pub = "清华大学";
    public StaticBook(String title,double price){
        this.price = price;
        this.title = title;
    }
    public String getInfo(){
        return "图书名称："+this.title +",价格：" + this.price + ",出版社："+this.pub;
    }
}
