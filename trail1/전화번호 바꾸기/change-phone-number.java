import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] n = number.split("-");
        System.out.println(n[0]+"-"+n[2]+"-"+n[1]); 
    }
}