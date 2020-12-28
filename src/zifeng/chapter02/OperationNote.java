package zifeng.chapter02;

/**
 *
 * Java语句又很多表达形式，表达式就是其中的一种，表达式由操作数与运算符组成，操作数可以是常量，变量可以是方法，运算符就是数学中的运算符。
 *
 * 运算符：赋值运算符、关系运算符、算数运算符、逻辑运算符、条件运算符、括号运算符；
 *
 * 关系运算符：大于、大于等于、小于、小于等于、等于、不等于
 *   关系运算符主要功能是进行数据的大小关系比较，返回的结果是boolean型数据。
 *
 *
 * 数学运算符：+ - * /  %（取余，求模）
 *   表达式简写：*= /= += -= %=     例如：num *= 2  等价于 num = num * 2
 *   模概念：实际上就是余数的概念；
 *   ++ 自增     -- 自减
 *   ++变量，--变量： 先在前面标识的是先进行变量内容的自增1或自减1，再使用变量进行数学计算。
 *   变量++，变量--：先使用变量内容进行计算，而后在实现自增或自减的操作。
 *
 *
 * 三目运算符
 *    三目是一种赋值运算的形式。
 *    表达式：数据类型  变量 = 布尔表达式 ？ 满足此表达式时设置的内容 ： 不满足此表达式时设置的内容；
 *
 * 逻辑运算符
 *
 *    逻辑运算一共包含：与（多个条件一起满足）、或（多个条件有一个满足）、非（使用!操作 ,可以实现true和false的转换）
 *
 *    与操作：与操作表示将若干个条件一起进行连接判断，同时满足返回true，有一个不满足返回false;与操作有两种运算符
 *    &（普通与）
 *    当前面的判断出现false结果时，后面的判断依旧执行。
 *    &&(短路与)
 *    当前面的判断出现false结果后，后面的程序判断则会停止执行。
 *
 *
 *    或操作
 *    或操作是将若干个条件一起判断，其中只要有一个返回true，结果就是true，两者都返回false，其结果才是false;
 *    |（普通或）
 *    当前面的条件判断返回true之后，后面的条件还会执行，导致程序异常。
 *
 *
 *    位运算
 *    位运算在Java中，&，|，~，*，>>,<<,>>>,所有的位运算都是采用二进制数据进行操作的。
 *
 *
 *
 */
public class OperationNote {
    public static void main(String[] args) {
        //关系运算符：大于、大于等于、小于、小于等于、等于、不等于
        System.out.println("3>1 = "+(3 > 1));
        System.out.println("3>=1 = "+(3 >= 1));
        System.out.println("3<1 = "+(3 < 1));
        System.out.println("3<=1 = "+(3 <= 1));
        System.out.println("3==1 = "+(3 == 1));
        System.out.println("3!=1 = "+(3 != 1));



        //数学运算符
        int numA = 10;
        int numB =12 ;
        System.out.println(numA + numB);
        System.out.println(numA * numB);
        System.out.println(numB - numA);
        System.out.println(numA / (double)numB);


        //三目运算
        //注释：如果numA大于numB 返回结果为true，则将numA赋值给max，否则反之
        int max = numA > numB ? numA : numB ;
        System.out.println(max);


        //逻辑运算符暂不做示例


    }
}
