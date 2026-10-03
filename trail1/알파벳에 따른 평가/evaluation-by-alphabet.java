import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        switch (var) {
            case "S":
                System.out.println("Superior");
                break;
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Usually");
                break;
            case "D":
                System.out.println("Effort");
                break;
            default:
                System.out.println("Failure");
                break;
        }
    }
}