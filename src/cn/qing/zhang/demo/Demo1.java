package cn.qing.zhang.demo;

/**
 * Description ：格式输出使用
 * Created by zhangqing on 2016/9/4.
 */
public class Demo1 {
    public static void main(String[] args) {
        double d = 123.4324;
        int a = 1234;
        String s ="你好";
        System.out.println("hello world");
        //%表示格式化输出 后面表示格式化方式
        System.out.printf("格式化输出浮点数:%f",d);
        System.out.println();
        System.out.printf("输出长度9,2位小数:%+9.2f",d);//+表示正数，-表示左对齐
        System.out.println();
        System.out.printf("十进制整数:%d",a);
        System.out.println();
        System.out.printf("八进制整数:%o",a);
        System.out.println();
        System.out.printf("十六进制整数:%#x",a);//#加上标示标示16进制
        System.out.println();
        System.out.printf("输出字符串:%s",s);
        System.out.println();
        System.out.printf("输出一个浮点数：%f;输出一个十进制整数：%d;输出一个字符串:%s",d,a,s);
        System.out.println();
        System.out.printf("输出字符串%2$s,数字%1$d的十进制类型为%1$#x",a,s);//x$表示第几个参数
        System.out.println("修改develop分支");
    }
}
