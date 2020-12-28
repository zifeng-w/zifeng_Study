package zifeng.chapter02;

/**
 * 程序的结构：顺序结构、选择结构、循环结构
 *
 *   顺序结构
 *      程序由上至下逐行执行，一条语句执行完后继续执行一条语句，一直到程序的末尾。
 *   选择结构
 *      选择（分支）结构是根据条件的成立与否，再决定要执行哪些语句的一种结构。
 *
 *      if选择结构：可以判断指定布尔表达式的结果
 *      switch选择结构：不能使用布尔表达式，只能进行整数或字符的判断，JDK1.5支持枚举判断，JDK1.7支持了String的判断。
 *           注意：很多开发工具对于switch的支持仍然没有考虑到String，最稳妥的方法还是在switch上使用数字或字符的判断;
 *   循环结构
 *      循环结构是根据判断条件的成立与否，决定程序段落的执行次数，而这个程序就称为循环主体。
 *
 *
 *     循环的特点：
 *        循环的结束判断
 *        每次循环执行的时候，循环条件要求修改；
 *      注意：避免死循环
 *
 *        while循环
 *          while循环分为while循环和do....while循环两种语法方式
 *             do...while 表示先执行后判断，而while表示先判断后执行。
 *        for循环
 *          特点：已经明确知道循环次数；
 *
 *
 *
 *     循环使用建议：
 *         while循环：在不确定循环次数，但是确定循环结束条件的情况下使用；
 *         for循环：确定循环次数的情况下使用
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
public class StructureNote {
    public static void main(String[] args) {
        double score = 00.0 ;
        if (score >90){
            System.out.println("恭喜您及格了");
        }else{
            System.out.println("只差一点点，继续努力哦");
        }



        int sum = 0;

        for(int  init = 1; init <= 100; init++){
            sum = sum + init;
            System.out.println(sum);

        }
        System.out.println("1~100累加的和为："+sum);



        //打印乘法口诀表


    }
}
