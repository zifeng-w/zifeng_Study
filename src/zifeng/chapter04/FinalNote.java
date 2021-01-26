package zifeng.chapter04;

/**
 *  final 称为终结器，可以使用final定义类、方法或属性。
 *      使用final定义的类不能再有子类，即任何类不能继承以final声明的父类。
 *      使用final定义的方法不能被子类所重写
 *      使用final定义的变量就成为了常量，常量必须在定义的时候设置好内容，并且不能修改。
 *
 *
 *
 *   多态
 *     多态是面向对象的一个主要特征。
 *
 *
 *     方法的多态性：重载或重写
 *       重载：同一个方法名称，根据不同的参数类型及个数可以完成不同的功能
 *       重写：同一个方法，根据实例化的子类对象不同，所完成的功能不同
 *
 *
 *     对象的多态性
 *        向上转型：子类对象变为父类对象，格式：父类   父类对象 = 子类实例， 自动转换
 *        向下转型：父类对象变为子类对象，格式：子类   子类对象 = (子类) 父类实例， 强制转换
 *
 *
 *      instanceof 此关键字可以判断某一个对象是否是指定类的实例，如果是则返回true，否则false。
 *      在进行向下转型的时候建议都使用instaceof判断。
 *
 *
 *
 *
 *
 *
 */
public class FinalNote {
    public static void main(String[] args) {
         final  String  fin = "hello";
        System.out.println(fin);


        System.out.println("---------多态-------");
        B b = new B();          //实例化的是子类对象
        b.print();              //调用被子类重写过的方法


        A a = new B();        //实例化的是子类对象，向上转型
        a.print();            //调用被子类重写过的方法

        //向下转型，强制转换
        B ba = (B)a;



    }
}
class A {
    public  void print(){
        System.out.println("A类");
    }
}
class B extends A {
    @Override
    public void print() {
        System.out.println("B类");
    }
}





