package src.main.java.com.adepuu.exercises.session8;
import java.util.UUID;

public class User {
    private String userId;
    private String username;
    private String password;

    public User(String username, String password) {
        this.userId = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
