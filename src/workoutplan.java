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
    @Override
    public String toString() {
        return "Workout " + name + ", duration " + duration + " minutes";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof workoutplan)) return false;
        workoutplan that = (workoutplan) o;
        return duration == that.duration && name.equals(that.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, duration);
    }
}