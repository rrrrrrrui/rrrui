package anlie;
import java.util.Random;
import java.util.Scanner;
public class anliedemo6and2 {
    public static void main(String[] args) {
        int number[]={9,666,188,520,99999};
        start(number);
    }
    public static void start(int number[]){
        System.out.println("请输入任意字符进行抽奖");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            Random r=new Random();
            sc.next();
            int j=r.nextInt(number.length);
            int temp=0;
            temp=number[j];
        number[j]=number[i];
        number[i]=temp;
            System.out.println("您中奖金额是"+number[i]);
        }
        System.out.println("红包没有了");
    }
}
