package zifeng.chapter01;
/**
 * 发展历程：
 *  1995年sun公司推广Java变成语言。
 *  第一阶段：1995年JDK1.0 -JDK1.2（1998年推出） Java更名为java 2
 *  第二阶段：JDK1.3 - JDK 1.4
 *  第三阶段：JDK1.5（2005年）-  JDK1.7 （被oracle收购后推出）
 *
 * Java分支
 *   Java SE （基础） 又名J2SE 2005年更名 Java SE，该分支包含构成Java语言核心的类，比如数据库连接，接口定义，数据结构，输入输出，网络编程
 *   Java EE （企业级开发） 包含Java SE 所有的类，同时也包含用于开发企业级应用的类，如EJB,Servlet，JSP，XML，事务控制
 *   Java ME （嵌入式开发） 主要用于消费类产品的软件开发，如呼机，智能卡，手机，PDA，机顶盒
 *
 * Java的特性
 *   简洁有效
 *   可移植性
 *   面向对象
 *   解释型
 *   分布式计算   疑问：什么是socket通信技术
 *   拥有较好的性能
 *   健壮，防患于未然
 *   具有多线程处理能力
 *   具有较高的安全性
 *   是一种动态语言
 *   是一种中性结构
 *
 *
 * 关于编译型和解释型语言的区别
 *   编译型：编译之后会形成一个*.exe 的文件
 *   解释型：直接将代码放到服务器上进行解释执行
 *
 * Java代码的处理过程
 *   Java程序问价你的后缀是 *.java,一个java程序首先必须经过编译，编译之后形成一个*.class文件（字节码），而后在计算机上运行（虚拟计算机--JVM）。
 *
 *  类的定义
 *   类是Java中的基本组成元素，所有的Java程序一定要被类管理，定义类的简单格式如下：
 *      public  class 类名称{
 *
 *      }
 *    注意事项：
 *     1、public class 定义：类名称必须与文件名称一致，否则程序将无法编译，一个程序中只能有一个public class
 *     2、class定义： 类名称可以和文件名称不一致，但是生成的是class定义的名称。 在一个*.java程序中可能存在多个class定义，编译之后会分为不同的*.class文件
 *
 *
 *  Java主方法
 *   主方法表示的是一个程序七点，所有的程序代码都有此开始顺序执行;
 *
 *  类的名称规范：每一个单词的开头首字母大写，例如：TestDemo
 *
 *
 *
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}