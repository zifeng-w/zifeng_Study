package zifeng.chapter02;

/**
 * 标识符与关键字
 *     标识符有字母、数字、—、$ 组成，其中不能以数字开头，不能是Java中的关键字;
 *     Java中的标识符区分大小写;
 *     对于$ 有特殊意义，建议不要使用
 *
 * 关键字（保留字）
 *     abstract\assert\boolean\break\byte\case\catch\char\class\continue\const\default\do\double\else\extends\enum\final\finally\float\for\goto\if\
 *     implements\import\instanceof\int\interface\long\native\new\package\private\protecetd\public\return\short\static\synchronized\super
 *     strictfp\this\throw\throws\transient\try\void\volatile\while
 *
 *
 *
 */
public class DocNotes {
    public static void main(String[] args) {
        //单行注释
        System.out.println("单行注释");
        /*
        * 此处为多行注释
        *
        * */
        System.out.println("多行注释");
        /**
         * 文档注释
         * @author 紫枫
         *
         */
        System.out.println("文档注释");
    }
}
