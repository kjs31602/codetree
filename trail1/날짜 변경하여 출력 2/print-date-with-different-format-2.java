import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] d = date.split("-");
        System.out.printf("%s.%s.%s",d[2], d[0], d[1]);
    }
}