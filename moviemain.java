package copyanliemovie;

import anlie.movieoperator;

import java.util.Scanner;

public class moviemain {
    public static void main(String[] args) {
moviekind movies[]=new moviekind[4];
        movies[0]=new moviekind("水门桥",38.9,9.8,"徐克","吴京",1);
        movies[1]=new moviekind("出拳吧",39,7.8,"唐晓白","田雨",2);
        movies[2]=new moviekind("月球陨落",42,7.9,"罗兰","贝瑞",3);
        movies[3]=new moviekind("一点就到家",35,8.7,"许宏宇","刘昊然",4);

        copyanliemovie.movieoperator operator=new copyanliemovie.movieoperator(movies);
        operator.searchbyid(3);
        operator.printmovie();


        while (true) {
            System.out.println("==电影信息系统==");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据ID查询某个电影的详细信息");
            System.out.println("请您输入操作命令：");
            Scanner sc=new Scanner(System.in);
            int command=sc.nextInt();
            switch (command){
                case 1:
                    operator.printmovie();
                    break;
                case 2:
                    System.out.println("请输入你要查询的电影id");
                    int id=sc.nextInt();
                    operator.searchbyid(id);
                    break;
                default:
                    System.out.println("您输入的命令有问题");

            }
        }
    }
}
