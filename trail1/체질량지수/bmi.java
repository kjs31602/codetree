import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int BMI = (10000*w) /(h*h);
        System.out.println(BMI);
        if(BMI >= 25){
            System.out.println("Obesity");
        }
    }
}