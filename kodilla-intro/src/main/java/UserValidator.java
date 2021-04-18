public class UserValidator {

    public void checkAgeHeight(AppUser user){
        if (user.getName() != null) {
            if (user.getAge() > 30 && user.getHeight() > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
