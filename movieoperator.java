package copyanliemovie;

public class movieoperator {
  private  moviekind movies[];
    public movieoperator(moviekind[] movies){
        this.movies=movies;
    }
    public void printmovie(){
        System.out.println("系统全部电影信息如下");
        for (int i = 0; i <movies.length ; i++) {
            moviekind m=movies[i];
            System.out.println("编号"+m.getId());
            System.out.println("名称"+m.getName());
            System.out.println("价格"+m.getScore());
            System.out.println("------------------");
        }
    }
     public void searchbyid(int id){
         for (int i = 0; i <movies.length ; i++) {
             moviekind m=movies[i];
             if(m.getId()==id){
                 System.out.println("该电影详情如下");
                 System.out.println("电影详情如下：");
                 System.out.println("编号:"+m.getId());
                 System.out.println("名称:"+m.getName());
                 System.out.println("价格:"+m.getScore());
                 System.out.println("得分:"+m.getInfo());
                 System.out.println("导演:"+m.getActor());
                 System.out.println("主演:"+m.getDirector());
             }



         }
     }
}

