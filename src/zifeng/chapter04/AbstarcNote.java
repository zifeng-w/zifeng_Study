package zifeng.chapter04;

/**
 *  抽象类指在普通类的结构里面增加抽象方法的组成部分，抽象方法指的是没有方法体的方法，同时抽象方法还必须使用abstract 关键字进行定义。
 *  拥有抽象方法的类一定属于抽象类，抽象类要使用abstract 声明
 * 
 * 
 * 
 */
abstract class AbstarcNote {
    public void fun(){
        System.out.println("存在有方法体的方法");
    }
    //此方法并没有方法体的声明，并且存在abstract 关键字，表示抽象方法
    public abstract  void print();
}
