package zifeng.chapter02;

/**
 * 数据类型
 *   基本数据类型
 *     数值型
 *         整数类型(byte\short\int\long)
 *         浮点类型(double\float)
 *     字符型（char）
 *     布尔型（boolean）
 *   引用数据类型
 *      类（class）
 *      接口（interface）
 *      数组
 *
 *  基本数据类型的大小、范围、默认值
 *    byte ：8位  -128-127   0
 *    short：16位  -32768-32767 0
 *    int  :32位  -2147483648-2147483647
 *    long :64位  -9223372036854775808-9223372036854775807
 *    float:32位  -3.4E38-3.4E38
 *    double:64位  -1.7E308-1.7E308
 *    char: 16位   0-255
 *    boolean:  true 或 false
 *
 *
 *  时间：2020年12月18日
 *
 *  数据溢出
 *    定义：当int型变量与int型常量进行计算后其结果依然是int型，但如果此时计算超过了其保存的范围，就会出现一个循环的操作，最大值如果继续增加就会变为最小值，随后一致向其次的最小值进行循环，反之最小值减1就变为最大值，此类现象称为数据溢出
 *
 *    解决方案：
 *      若想解决数据溢出问题，只能扩大数据范围的方式来实现，比int范围更大的是long数据类型，而要将int型的变量或常量变为long数据类型有如下两种形式：
 *       1、int型常量转换为long型常量，使用“数字+L” "数字+l（小写字母L）"完成。
 *       2、int型变量转换为long型变量，使用“（long）变量名称”。    注：此类方式可实现各种数据类型的转换。
 *
 *    注意事项：
 *       在将范围大的数据类型强制转换为范围小的数据类型时，依然要考虑数据是否会发生溢出。
 *
 *
 *  数据类型转换
 *     数据范围小的数据与数据范围大的数据进行数学计算时，自动向大范围的数据类型转换后计算。
 *     数据范围大的数据要变为数据范围小的数据时，必须采用强制转换。
 *     若要强制性地将某一数据类型变为其他类型，则必须采用强制类型转换。
 *
 *     建议：在实际开发中，应尽量少去使用强制类型转换，以免造成数据精度的丢失以及数据功能性的破坏。
 *
 *
 *  扩展知识
 *     计算机的世界里一切都是以编码的形式出现的，Java使用的是十六进制的UNICODE编码，此类编码可以保存任意的文字。
 *
 *
 *
 */
public class NumberNote {
    public static void main(String[] args) {
        /*
         * 整型
         * 为变量赋值格式：数据类型 变量名称 = 常量 ;
         *
         *
         */
        int num = 10;                  //10是常量，常量的默认类型是int
        int result = num * 2;          //利用num变量的值*2，并且将其赋值给result
        System.out.println(result);    //输出值

        System.out.println("分割线----------------------");
        //如果超过了int最大值或最小值的结果
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Int最大值："+max);   //Int最大值：2147483647
        System.out.println("Int最小值"+min);     //Int最小值-2147483648
        //int变量 +— int型常量 = int型数据
        System.out.println(max + 1);            //-2147483648
        System.out.println(min - 1);            //2147483647
        System.out.println(min - 2);            //2147483646

        System.out.println("分割线----------------------");
        //解决数据溢出：扩大数据类型
        System.out.println(max + 1L);          //2147483648
        System.out.println(min - (long)1);     //-2147483649
        System.out.println((long)min - 2);    //-2147483650


        //将范围大的数据类型变为范围小的数据类型
        long nums = 1000;                   //1000常量是int型，使用long接受，发生了向大范围转型（自动转型）
        int x = (int)nums;                  //把long变为int（向下转型）
        System.out.println(x);


        /*
         * byte  数据类型的范围：-128-127
         *
         *   如果定义的int类型数据值超过了byte的数据范围，最终会造成数据溢出
         *   如果定义的int类型数据值在byte的数据范围之内， 则可直接赋值给byte类型的变量，此时程序会自动进行数据类型转换。
         *
         *
         */
        int byNum = 130;           //此范围超过了byte的数据大小范围
        byte by = (byte) byNum;      //由int变为byte
        System.out.println(by);

        /*
         *  浮点数（小数）
         *  double 保存范围最广的数据类型
         *
         *  int数据类型保存的数据范围小于double数据类型，int类型自动转型为double类型，最后在进行计算
         *
         *  默认的小数类型是double，若要使用float类型，则需要将double型变为float型，需要进行强制转换。
         *  转换的方式有两种：1、使用字母 F 或 f； 2、在变量或常量前使用“(float)” 声明。
         */
        double dbNum = 10.2;
        //double型 * int型（自动转换为double型） = double型
        System.out.println(dbNum * 2);


        float f1 = 10.0F;                   //强制转换为float型
        float f2 = 10.1f;                   //强制转换为float型
        float f3 = (float)10.2;             //强制转换为float型
        System.out.println(f1 + f2 * f3);   //float * float = float类型



        //程序中关于除法的问题
        int yinZi = 9 ;
        int chuShu = 5 ;
        System.out.println(yinZi / chuShu);   //商等于1
        //由于两个数都是int类型，计算的结果依旧是int类型

        //解决计算精度的问题
        System.out.println(yinZi / (double)chuShu);  //商等于1.8，若一个变量为double类型，则计算结果为double类型

        /*
          字符型 char
             byte属于字节，一个字符等于2字节，在java中字符主要与int变量的转换。
             在程序中使用单引号声明的内容为字符，每个单引号里面只能保存一位字符。
             大写字母：65-90
             小写字母：97-122
             0-9的编码范围：48-57


           实现字母大小写的转换
             由于每个字母有其对应的编码值，获取到字母的编码值，通过数值计算可以拿到对应的字母的编码值，这样再转换为对应的大写字母就可以了。

          */
        char c = 'A' ;       //字符格式

        System.out.println(c);          //A
        int charNum = c + 22;
        System.out.println(charNum);     //87

        /*
        * boolean  布尔型
        * 布尔型是一种逻辑结果，主要保存true和false两种结果，用于逻辑判断使用
        *
        *
        * */


        /*
        * String 属于引用类型；
        * String 表示的是一个字符串，即：多个字符的集合，String 要求使用双引号声明内容
        * 经过试验，String 双引号中声明的内容就表示是一个String型的常量。
        *
        *
        * Java里面也支持转义字符的使用，例如：换行（\n）、制表符(\t)、双引号(\\)、斜杠（\"）、单引号(\')
        *
        * */

        String str = "hello" ;
        System.out.println(str);
        System.out.println("hello");




    }





}
