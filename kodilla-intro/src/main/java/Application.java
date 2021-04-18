public class Application {
    public static void main(String[] args) {
        AppUser user = new AppUser("Adam", 40.5, 178);
        UserValidator validator = new UserValidator();

        validator.checkAgeHeight(user);
    }
}