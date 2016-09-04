package cn.qing.zhang.demo;

/**
 * Description ：99乘法表
 * Created by qing.zhang on 2016/9/4.15:53
 */
public class Demo3 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
