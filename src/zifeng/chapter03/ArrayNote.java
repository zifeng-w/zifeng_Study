package zifeng.chapter03;

/**
 *   数组：指的就是一组相关变量的组合;
 *
 *   数组的定义语法：
 *     第一种：声明并开辟数组
 *      数据类型 数据名称[] = new 数据类型[长度];
 *      数据类型[] 数组名称 = new 数据类型[长度] ;
 *
 *     第二种；
 *      声明数组： 数据类型  数组名称[长度] = null ;
 *      开辟数组： 数组名称  = new 数据类型[长度];
 *
 *      所有数组的下标从0开始，若超过数组允许下表的长度，会出现数组越界异常(Array Index Out Of Bounds Exception)
 *
 *      数组.length
 *
 *
 *      数组本身属于引用数据类型，如果直接使用未开辟空间的数组，一定会出现"NullPointerException"（空指向异常）
 *
 *
 *      二维数组
 *        动态初始化： 数据类型 数组名称[][] = new 数据类型[行的个数][列的个数];
 *        静态初始化： 数据类型 数组名称[][] = new 数据类型[][]{{值，值，值}{值，值，值}}
 *
 *
 *
 *      数组复制
 *        System.arraycopy(源数组名称，源数组复制开始索引，目标数组名称，目标数组复制开始索引，长度);
 *
 *
 *      数组排序
 *         数组排序可以按照由小到大的顺序对基本数据类型的数组进行排序;
 *         java.util.Arrays.sort(数组名称);
 *
 *
 *      扩展知识
 *         java.util 是一个Java系统包的名称。
 *
 *
 *
 *      对象数组
 *         对象数组的动态初始化
 *          类名称  对象数组名称 = new  类名称[长度];
 *
 *         对象数组的静态初始化
 *          类名称  对象数组名称 = new 类名称[]{实例化对象，实例化对象,...}
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
public class ArrayNote {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}}; //定义二维数组
        for (int x = 0 ; x < arr.length;x++){
            for (int i = 0; i < arr[x].length ; i++) {
                System.out.println(arr[x][i]+"\t");
                //System.out.println(arr);  //输出的是地址
            }
            System.out.println();
        }

        System.out.println("*************");

        int arr1[] = new int[]{1,2,4};


        change(arr1);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("****************");
        //数组排序
        int arrSort[] = new int[]{8,6,34,1,6,7,2};
        for (int i = 0; i < arrSort.length; i++) {
            System.out.print(arrSort[i] + "\t");

        }
        System.out.println();
        sort(arrSort);
        for (int x = 0; x < arrSort.length; x++){
            System.out.print(arrSort[x]+"\t");

        }


    }

    /**
     * 此方法的主要功能是进行数组数据的改变操作，将数组中的每个元素乘以2
     * @param temp 要进行改变内容的数组引用
     */
    public static void change(int temp[]){
        for (int i = 0; i< temp.length;i++){
            temp[i] *= 2;
        }
    }

    /**
     * 此方法的主要是功能是进行数组排序，按照数值从大到小进行排序
     * @param temp
     */
    public static void  sort(int temp[]){
        for (int i = 0; i <temp.length ; i++) {
            for (int j = 0; j < temp.length-1; j++) {
                if (temp[j] <temp[j+1]) {

                    int t =temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] =t;

                }

            }


        }
    }



}


