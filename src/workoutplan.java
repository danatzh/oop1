public class workoutplan{
    private String name;
    private int duration;
    public workoutplan(){}
    public workoutplan(String name, int duration){
        this.name=name;
        this.duration=duration;
    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getDuration(){return duration;}
    public void setDuration(int duration){this.duration=duration;}
    public void printInfo(){
        System.out.println("workout"+name+", duration"+duration+"minutes");
    }
}