package zifeng.chapter03;

/**
 * 链表
 *   链表是一种最为简单的数据结构，主要目的是依靠引用关系来实现多个数据的保存。
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
public class LinkListNote {         //每一个链表实际上就是由多个节点组成的
    private String data;            //要保存的的数据
    private LinkListNote next;      //要保存的下一个节点

    /**
     * 每一个LinkListNote 类对象都必须保存有相应的数据
     * @param data 要通过节点包装的数据
     */
    public LinkListNote(String data){
        this.data = data ;

    }

    /**
     *  获得包装的数据
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * 设置或修改当前节点包装的数据
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 取得当前节点的下一个节点
     * @return 当前节点的下一个节点引用
     */
    public LinkListNote getNext() {
        return next;
    }
    /**
     * 设置下一个节点关系
     * @return 保存下一个LinkListNote类引用
     */
    public void setNext(LinkListNote next) {
        this.next = next;
    }
}

class Demo{
    public static void main(String[] args) {
        //第一步：定义要操作的节点病设置好包装的字符串数据
        LinkListNote note = new LinkListNote("火车头");  //定义节点，包装数据
        LinkListNote noteA = new LinkListNote("火车厢A");
        LinkListNote noteB = new LinkListNote("火车厢B");
        note.setNext(noteA);
        noteA.setNext(noteB);
        //第二步：根据节点关系取出所有数据
        LinkListNote root = note;               //当前从根节点开始读取
        while (root != null){                   //当前节点存在数据
            System.out.println(root.getData());
            root = root.getNext();               //将下一个节点设置为当前节点
        }


    }
}
