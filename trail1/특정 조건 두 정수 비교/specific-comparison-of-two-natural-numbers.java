import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int first = (A < B) ? 1 : 0;
        int second = (A == B) ? 1 : 0;
        System.out.println(first + " " + second);
    }
}