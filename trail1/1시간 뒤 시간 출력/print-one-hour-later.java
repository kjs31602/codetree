import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strArr = a.split(":");
        int h = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        h += 1;
        if (h == 24) {
            h = 0;
        }
        System.out.printf(h + ":" + m);
    }
}