public class user {
    private String username;
    private int age;
    public user(){}
    public user(String username, int age){
        this.username = username;
        this.age = age;
    }
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public void printInfo() {
        System.out.println("user "+username+", age "+ age);
    }
    @Override
    public String toString() {
        return "User " + username + ", age " + age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user)) return false;
        user user = (user) o;
        return age == user.age && username.equals(user.username);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(username, age);
    }
}
