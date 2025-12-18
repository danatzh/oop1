public class Main {
    public static void main(String[] args) {
        FitnessApp app = new FitnessApp(" Example Fitness App");
        user user1=new user(" Maria", 21);
        user user2=new user(" John", 18);
        workoutplan plan1=new workoutplan("Morning plan ", 30);
        workoutplan plan2=new workoutplan("Athlete lift ", 45);
        app.printInfo();
        user1.printInfo();
        user2.printInfo();
        System.out.println("\nComparison: ");
        System.out.println("user1==user2 "+(user1==user2));
        System.out.println("plan1==plan2 "+(plan1==plan2));
    }
}
