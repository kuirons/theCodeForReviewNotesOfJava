import org.omg.CORBA.INTERNAL;

import java.awt.*;

/**
 * Created by khx on 17-9-1.
 */
public class operate {
    private int paramo;

    public int getParamo() {
        return paramo;
    }

    public void setParamo(int paramo) {
        this.paramo = paramo;
    }

    //当string后面是“+”的时候，如果+后面不是一个string类，编译器会尝试将该类转换为string类。
    public void changeToString() {
        int a = 65;
        System.out.print("the result is：" + a);
    }

    //int转换为对应的ascii字符
    public void intToAscii() {
        int a = 65;
        System.out.print((char) a);
    }

    //常量赋值
    public void constantAssignment() {
        int a = 1;
        int b = a;
        System.out.println("未赋值前a+b：" + (a + b));
        b=2;
        System.out.println("赋值后a+b：" + (a + b));
    }

    //测试Integer自带的转换为二进制的方法
    public void integerToBinary(){
        Integer i=new Integer(24);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toUnsignedString(i,3));
    }

    public void stringToInteger(){
        String str="123456";
        System.out.println(Integer.decode(str));
    }

    //测试对于+号，其序列中混杂字符串和其他数据类型时，string类型位置对最后输出结果的影响
    public void ifHasStringWhenUsingAddOperate(){
        int a=1;
        int b=2;
        String c="test";
        int d=4;
        int e=5;
        System.out.println(a+b+c+d+e);
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        operate test = new operate();
        test.ifHasStringWhenUsingAddOperate();
    }
}