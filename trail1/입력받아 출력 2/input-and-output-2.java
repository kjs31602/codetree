import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] ar = a.split("-");
        System.out.printf("%s%s",ar[0],ar[1]);
    }
}