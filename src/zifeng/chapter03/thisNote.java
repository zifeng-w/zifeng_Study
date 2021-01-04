package zifeng.chapter03;

/**
 *   this关键字
 *      this可以完成三件事：调用本类属性、调用本类方法、表示当前对象
 *
 *      调用本类属性：
 *          在构造方法中，由于受就近取用原则，在构造方法中存在同名的变量名称时，会直接调用方法中的变量而不是类中的属性，因此需要this.属性来进行调用。
 *
 *      扩展知识：为了减少不必要的麻烦，在类中访问属性时不管是否有重名的变量，一定要加上this；
 *
 *      调用本类方法：
 *         调用本类普通方法：可以使用this.方法() 调用
 *         调用本类构造方法:可以使用this() 调用
 *
 *          关于this调用构造方法的限制：使用this() 调用构造方法形式的代码只能够放在构造方法的首行；
 *          进行构造方法互相调用时，一定要保留调用的出口；
 *
 *
 *       表示当前对象：下方代码表示的则是表示当前对象
 *
 *
 *
 *       引用传递
 *         同一块堆内存空间可以被不同的栈内存所指向，不同栈内存可以对同一堆内存进行内容的修改。
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
public class thisNote {
    public static void main(String[] args) {
        thisNotes thi  =  new thisNotes();    //实例化新的对象
        System.out.println("thi = " + thi);
        thi.print();
        System.out.println("----------");
        thisNotes th = new thisNotes();       //实例化一个新的对象
        System.out.println("th = "+ th);
        th.print();


        System.out.println("----------引用传递-----------");

        String msg = "Hello";            //定义String类对象
        fun(msg);                        //引用传递
        System.out.println(msg);         //输出msg对象内容



    }
    /*
    * 字符串的内容不可改变，String类对象内容的改变是通过引用的变更实现的，但是所有的变更都在是fun()方法中完成的，一旦fun()方法执行完毕temp将失效，其对应的对内存也将成为垃圾。
    *
    *
    * */
    public static  void fun(String temp){  //接收字符串引用
        temp = "World";                   //改变字符串引用
    }
}


class thisNotes{
    public  void print(){                      //调用print()方法的对象就是单签对象，this就自动与此对象指向同一块内存地址
        System.out.println("this = "+this);    //this就是当前调用方法的对象
    }




}
