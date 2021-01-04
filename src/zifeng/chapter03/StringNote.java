package zifeng.chapter03;

/**
 *    String 是字符串的描述类型
 *
 *    String类的两种实例化方式
 *          String 变量 = "字符串";
 *          String str = new String("www.baidu.com");
 *
 *      两种实例化方式的区别：
 *          直接赋值：只会开辟一块堆内存空间，并且会自动保存在对象池中以供下次重复使用
 *          构造方法：会开辟两块堆内存空间，其中有一块空间将成为垃圾，并且不会自动入池，但是用户可以使用intern()方法手工入池。
 *
 *
 *
 *    引用类型都可以使用"==" 比较,但比较的不是内容，永远都知识地址的数值内容，所以 == 属于数值比较，比较的是内存地址
 *    如果要比较字符串内容，可以使用String类里面定义的犯法，内容比较操作
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
public class StringNote {

    public static void main(String[] args) {
        String str = "aaa";
        String stb = "bbb";
        System.out.println(str.equals(stb));
    }
}
