import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.util.in);
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }
}
