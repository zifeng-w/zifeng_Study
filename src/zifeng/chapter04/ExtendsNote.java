package zifeng.chapter04;

/**
 *  继承是面向对象的第二大重要特性，而继承性要解决的就是代码重用的问题，利用已有的类继续派生出新的子类，也可以利用子类扩展出更多的功能。
 *  语法：
 *      class 子类 extends 父类()｛｝
 *
 *  继承的格式说明：
 *     对于extends 而言，应该翻译为扩充，但是为了理解翻遍，统一将其称为继承。
 *     子类又被称为派生类
 *     父类又被称为超类(Super Class)
 *
 *
 *
 *   子类实际上是将父类定义得更加具体化的一种手段。父类表示的范围大，而子类表示的范围小。
 *
 *
 *
 *   继承的限制
 *     Java不允许多重继承，但是允许多层继承：一个子类可以同时继承多个父类
 *     子类继承父类时，严格来讲会继承父类中的全部操作，但是杜宇所有的私有操作术语隐士继承，而所有的非私有操作属于显式继承。
 *     在子类对象构造前一定会默认调用父类的构造(默认使用无参构造)，以保证父类的对象先实例化，子类对象后实例化。
 *
 *
 *   super 关键字
 *       super() 主要是调用父类的构造方法，所以必须放在子类构造方法的首行。
 *
 *
 *
 *   覆写
 *      在子类定义属性或方法时，会出现定义的属性或方法与父类同名的情况，这样的操作就成为覆写。
 *
 *   方法的重写
 *       当子类定义了和父类的方法名称、返回值类型、参数类型或个数完全相同的方法时，就成为方法的重写。
 *
 *
 *
 *   注意：被子类重写的方法不能拥有比父类更严格的访问权限。
 *
 */
public class ExtendsNote {
    public void print(){
        System.out.println("父类方法");
    }
}


class ExtendsA extends ExtendsNote{
    @Override
    public void print() {                 //重写的是print()方法
        super.print();                    //访问父类中的print()方法
        System.out.println("子类输出");
    }
}



class ExtendsDemo{
    public static void main(String[] args) {
        ExtendsA exa = new ExtendsA();        //实例化子类对象
        exa.print();
    }
}