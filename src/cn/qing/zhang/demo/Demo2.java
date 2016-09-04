package cn.qing.zhang.demo;

/**
 * Description 简单事例
 * Created by zhangqing on 2016/9/4.
 */
public class Demo2 {
    public static void main(String[] args) {
        int a = 'A';//ascII 码表 自动转化 对应 65 a 对应97
        System.out.println(a);
        int num = a++;//执行先把a的值赋值给临时变量在进行+1 在将临时值赋值给num
        System.out.println(num);
        System.out.println(a);
        int num2 = a++;
        System.out.println(num2);
        int num3 = ++a;//将加1后的值赋值给num3
        System.out.println(num3);
    }
}
