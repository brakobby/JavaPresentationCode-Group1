
import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
    // User credentials and roles stored in a HashMap
    static HashMap<String, String> users = new HashMap<>();
    static HashMap<String, String> roles = new HashMap<>();
    
    public static void main(String[] args) {
        // Add some users and roles
        users.put("admin", "password123");
        users.put("user", "userpass");
        roles.put("admin", "Admin");
        roles.put("user", "User");

        Scanner scanner = new Scanner(System.in);

        // Prompt for login
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        // Verify credentials
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            authorizeUser(username);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Authorization based on role
    public static void authorizeUser(String username) {
        String role = roles.get(username);
        if ("Admin".equals(role)) {
            System.out.println("Welcome Admin! You have full access.");
        } else if ("User".equals(role)) {
            System.out.println("Welcome User! You have limited access.");
        }
    }
}
