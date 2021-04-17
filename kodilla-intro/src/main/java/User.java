public class User {
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        User users[] = new User[5];
        double average = 0.0;

        users[0]= new User("Anna", 39);
        users[1] = new User("Peter", 20);
        users[2] = new User("Mary", 25);
        users[3] = new User("Helen", 15);
        users[4] = new User("Jim", 60);

        for (int i = 0; i < 5; i++ ){
            average = average + users[i].getAge();
        }
        average = average / 5;

        System.out.println("Users whose age is below the age average (" + average + "):");
        for (int i = 0; i < 5; i++ ){
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName());
            }
        }
    }
}
