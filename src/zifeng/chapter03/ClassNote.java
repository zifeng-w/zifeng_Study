package zifeng.chapter03;

/**
 *  简单Java类
 *
 *   基本开发要求
 *      类名称必须存在意义
 *      类中所有的属性必须private封装，封装后的属性必须提供setter,getter
 *      类中可以提供任意多个构造方法，但是必须保留一个无参构造方法
 *      类中不允许出现任何输出的语句，所有信息输出必须交给被调用处输出
 *      类中需要提供有一个取得对象完整信息的方法，暂定为getInfo()，而且返回String数据;
 *
 *
 *
 *
 */
public class ClassNote {

    public static void main(String[] args) {
         Emp e = new Emp(123,"test","经理",1000,888);
        System.out.println(e.getInfo());

    }
}

class Emp{
    private int empno;
    private String ename;
    private  String job;
    private double sal;
    private double comm;
    public  Emp(){

    }
    public Emp(int eno,String ena,String jobs,double sals,double comms){
        empno = eno;
        ename = ena;
        job = jobs;
        sal = sals;
        comm = comms;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    /**
     * 取得简单Java类的基本信息，信息在被调用处输出
     * @return 包含对象完整信息的字符串数据
     */
    public String getInfo(){
       return "雇员编号" + "\n" +
               "雇员姓名" + "\n" +
               "雇员职位" + "\n" +
               "基本工资" + "\n" +
               "佣金" + "\n" ;

    }
}

