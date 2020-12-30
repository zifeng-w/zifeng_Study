package zifeng.chapter03;

/**
 *  面向对象
 *     发展历程
 *        面向对象的编程思想是20世纪70年代由IBM得Smalltalk语言推广的，而后又发展到了C++编程语言，最后由C++衍生出了Java;
 *
 *  面向对象与面向过程的比较
 *     面向过程：指的是针对某一个问题单独提出解决方案以及代码开发;
 *     面向对象：以一种组件化的形式进行代码的设计;
 *
 *  面向对象的三大特性：
 *     封装性
 *       封装是面向对象的方法所应遵循的一个重要原则。
 *       保护内部的定义结构安全性;
 *     继承性
 *        面向对象方法中的重要概念，并且是提高软件开发效率的重要手段;
 *        被继承的类称为父类或超类，而经继承产生的类成为子类或派生类; 根据继承的机制，派生类继承了超类的所有成员，并增加了自己的一些新的成员;
 *     多态性
 *        允许程序中出现重名现象;Java语言中含有方法重载与对象多态两种形式的多态。
 *        方法重载：在一个类中，允许多个方法使用同一个名字，但方法的参数不同，完成的功能也不同；
 *        对象多态：子类对象中可以与父类对象进行相互转换，而且根据其使用的子类不同完成的功能也不同；
 *
 *
 *   类与对象
 *      面向对象是整个Java的核心，而类与对象是支撑起Java面向对象开发的基本概念单元
 *
 *
 *    类表示一个客观世界中某类群体的一些基本特征抽象，属于抽象出的概念集合;
 *      类是有属性和方法组成的。属性就是一个变量，方法是一些操作的行为；
 *        扩展:类中的属性在开发中不一定只是变量，也有可能是其他内容，所以一般也会有人将其称为成员（Field）
 *            类中的方法在Java中使用Method单词描述，有的也会将其称为行为;
 *
 *
 *      定义类需要使用class关键字
 *      格式如下:
 *       class 类名称｛
 *            数据类型  属性（变量）;    声明成员变量（属性）
 *
 *       ｝
 *       public 返回值的数据类型 方法名称（参数1，参数2）｛   定义方法的内容
 *             程序语句;
 *             [return 表达式;]
 *       ｝

 *
 *    对象表示一个个具体的事物，如张三的汽车； 而描述这个事物的信息在概念中称为这个事物的属性；   而这些事物的动作行为称为方法；
 *
 *
 *
 *    声明并实例化对象的格式
 *     第一种：  类名称  对象名称 = new 类名称();
 *     第二种：  声明对象： 类名称 对象名称 = null;
 *             实例化对象： 对象名称 = new 类名称();
 *
 *
 *
 *
 *
 *    堆内存（heap）：保存每一个对象的属性内容，堆内存需要用关键字new才可以开辟，如果一个对象没有对应的堆内存指向，将无法使用;
 *               解释：保存对象的真正数据，都是每一个对象的属性内容;
 *    栈内存(stack):保存的是一块堆内存的地址数值，每一块栈内存只能够保留一块堆内存地址;
 *               解释:保存的是一块堆内存的空间地址;
 *
 *       注意：只要看见了关键字new不管何种情况下，都表示要开辟新的堆内存空间;
 *       一块堆内存可以同时被多个栈内存所指向，但是反过来，一块栈内存只能够保存一块堆内存空间的地址;
 *
 *
 *
 *      在引用数据类型关系时，一块没有任何栈内存指向的堆内存空间将成为垃圾，所有的垃圾会不定期地呗垃圾收集器(Garbage Collector)回收，回收后会被释放掉其所占用的空间;
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class ObjectNote {
    public static void main(String[] args) {
        /*声明并实例化对象的格式
         *第一种：  类名称  对象名称 = new 类名称();
         *第二种：  声明对象： 类名称 对象名称 = null;
         *        实例化对象： 对象名称 = new 类名称();
         *
         * 对象.属性：表示要操作类中的属性内容
         * 对象.方法：表示要调用类中的方法
         *
         * 扩展：类属于引用数据类型，关键字new的主要功能就是开辟内存空间，引用数据类型想使用，必须使用关键字new来开辟空间;
         *
         * */
        Book book = new Book();
        book.title = "完美世界";
        book.price = 88.8;
        book.getInfo();

    }


}



class Book{             //定义一个新的类
    String title;       //定义图书名称
    double price;       //定义图书价格
    /*
    * 输出对象完整信息
    *
    *
    * */
    public void getInfo(){   //此方法将由对象调用
        System.out.println("图书名称："+ title +"\n"+"图书价格：" + price);
    }
}