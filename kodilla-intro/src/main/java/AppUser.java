public class AppUser {
    private String name;
    private double age;
    private double height;

    public AppUser(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public double getAge(){
        return this.age;
    }

    public double getHeight(){
        return this.height;
    }
}
