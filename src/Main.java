public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter username: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        user inputUser = new user(name, age);
        inputUser.printInfo();

        FitnessApp app = new FitnessApp(" Example Fitness App");
        user user1=new user(" Maria", 21);
        user user2=new user(" John", 18);
        workoutplan plan1=new workoutplan("Morning plan ", 30);
        workoutplan plan2=new workoutplan("Athlete lift ", 45);
        java.util.ArrayList<user> users = new java.util.ArrayList<>();
        users.add(user1);
        users.add(user2);

        System.out.println("Users older than 20:");
        for (user u : users) {
            if (u.getAge() > 20) {
                System.out.println(u);
            }
        }
        app.printInfo();
        user1.printInfo();
        user2.printInfo();
        System.out.println("\nComparison: ");
        System.out.println("user1==user2 "+(user1==user2));
        System.out.println("plan1==plan2 "+(plan1==plan2));
    }

}
