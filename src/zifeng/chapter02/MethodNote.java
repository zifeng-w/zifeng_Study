package zifeng.chapter02;

/**
 *
 *  方法的定义及使用
 *     又称为函数，方法是一段可以被重复调用的代码。
 *     主要功能：封装可以执行的代码，不仅可以重复调用，方便地实现代码的维护。
 *     定义语法：
 *         pubic static 返回值类型  方法名称（参数类型  参数变量，...）｛
 *             方法体（本方法要执行的若干操作）
 *             return[返回值];
 *         ｝
 *     返回值的类型：
 *       1、如果方法设置了返回值，则需使用return语句返回与数据类型对应的数据；
 *       2、方法没有返回值，可以不适用return返回内容，但可以使用return结束方法调用；
 *
 *
 *   方法命名规范：
 *      第一个单词的字母小写，之后的每个单词字母大写。
 *
 *   return使用注意事项：
 *     在方法中执行return语句，就表示其之后的代码不再执行而直接结束方法调用。
 *     方法有返回值生命，必须返回相应类型的数据，若没有返回值声明，则直接编写return;
 *
 *
 *   方法重载：
 *      方法名称相同，参数的类型或个数不同，调用的时候将会按照传递的参数类型和个数完全不同方法体的执行。
 *
 *      建议所有重载后的方法使用同一种返回值类型
 *      方法重载的时候重点是根据参数类型及个数来区分不同的方法，与返回值的不同无关。
 *
 *   方法的递归调用
 *      递归调用指的是方法自己调用自己的形式；
 *
 *      递归操作必须满足以下两个条件：
 *         必须有结束条件；
 *         每次调用时都需要改变传递的参数；
 */
public class MethodNote {
    public static void main(String[] args) {

        printInfo();     //直接调用方法

        int result = addCount(10,20);
        System.out.println(result);


        //递归调用
        System.out.println(addSum(100));
    }




    /*
    * 信息输出操作
    *   定义一个没有返回值得方法
    *
    */
    public static void printInfo(){
        System.out.println("*************");
        System.out.println("www.baidu.com");
    }



    /**
     * 实现数据加法运算
     * @param x 操作数字1
     * @param y 操作数字2
     * @return  返回运算结果
     */
    public static int  addCount(int x,int y){

        return x+y;
    }

    public  static int addSum(int sum){
        if (sum == 1) {
            return sum;
        }
        return sum += addSum(sum-1);       //递归调用
    }



}
