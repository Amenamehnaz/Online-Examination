import java.util.*;

class Exam {
    Scanner sc = new Scanner(System.in);
    String username = "user";
    String password = "pass";

    public void login() {
        System.out.print("Enter username: ");
        String u = sc.nextLine();
        System.out.print("Enter password: ");
        String p = sc.nextLine();

        if (u.equals(username) && p.equals(password)) {
            menu();
        } else {
            System.out.println("Invalid credentials");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Update Profile\n2. Start Exam\n3. Logout");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    updateProfile();
                    break;
                case 2:
                    startExam();
                    break;
                case 3:
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void updateProfile() {
        System.out.print("Enter new username: ");
        username = sc.nextLine();
        System.out.print("Enter new password: ");
        password = sc.nextLine();
        System.out.println("Profile updated successfully!");
    }

    public void startExam() {
        System.out.println("Exam started! Answer the following MCQ:");
        System.out.println("Q1: What is 2 + 2?");
        System.out.println("a) 3  b) 4  c) 5  d) 6");
        System.out.print("Answer: ");
        String ans = sc.nextLine();

        System.out.println("Submitting your answer...");
        try {
            Thread.sleep(2000); // Timer simulation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Answer submitted successfully!");
    }
}

public class Task4_OnlineExamination {
    public static void main(String[] args) {
        Exam e = new Exam();
        e.login();
    }
}
