import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hours = a/3600;
        int b = a%3600;
        int minutes = b/60;
        int seconds = b%60;
        System.out.println(hours+" "+minutes+" "+seconds);
    }
}