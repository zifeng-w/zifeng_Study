package zifeng.chapter04;

/**
 *   接口的定义：一个类知识由抽象方法和全局常量组成的，该类被定义为接口
 *   使用关键字interface关键字来实现接口的定义
 *
 *
 *
 *
 *   接口具有以下使用原则
 *       接口必须要有子类，一个子类可以适用implements 关键字实现多个接口，避免单继承局限。
 *       接口的子类(如果不是抽象类)，必须要重写接口中的全部抽象方法
 *       接口的对象可以利用子类对象的向上转型进行实例化操作
 *
 *   实际开发接口使用的建议
 *       在进行某些公共操作时一定要定义出接口
 *       有了接口就需要利用子类完善方法
 *       如果是自己写的接口，绝对不要使用关键字new 直接实例化接口子类，应该使用工厂完成。
 *
 */
public class InterfaceNote implements Note {

    @Override
    public void print() {
        System.out.println("接口实现");
    }
}
interface Note{                               //定义接口
    public static final  String MSG="LOOK";   //全局常量
    public abstract  void print();            //抽象方法
}

/**
 * 接口测试
 */
class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceNote itFn = new InterfaceNote();
        itFn.print();
        System.out.println(Note.MSG);


        Fruit f = new Apple();
        f.eat();
        Fruit o = new Orange();
        o.eat();



        Fruit fn =Factory.getInstance("apple");   //通过工厂类取得指定标记的对象
        fn.eat();                                           //调用接口方法
    }
}

/**
 *   接口的应用--工厂设计模式
 *
 *
 *
 *
 */

interface Fruit{          //定义接口
    public void eat();    //定义抽象方法
}

 class Apple implements Fruit{      //定义接口子类

    @Override
    public void eat() {             //重写抽象方法
        System.out.println("吃苹果");
    }
}
class Orange implements  Fruit{

    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}


class Factory{
    /**
     * 取得指定类型的接口对象
     * @param className 要取得的类实例化
     * @return 如果指定标记存在，则Fruit接口的实例化对象，否则返回null
     */
    public static Fruit getInstance(String className){
        if ("apple".equals(className)) {          //是否是苹果类
            return  new Apple();
        }else if ("orange".equals(className)) {   //是否是橘子类
            return new Orange();
        }else{
            return null;
        }
    }
}