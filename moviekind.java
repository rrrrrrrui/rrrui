package copyanliemovie;

public class moviekind {
  private  String name;
   private double score;
    private String actor;
   private int id;
   private String director;
   private String info;

   public  moviekind(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public moviekind(String name, double score, double price,  String director, String info,int id) {
        this.name = name;
        this.score = score;
        this.actor = actor;
        this.id = id;
        this.director = director;
        this.info = info;
    }

}
