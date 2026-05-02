import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radious = input.nextDouble();
        double area = Math.PI * Math.pow(radious, 2);
        System.out.println(area);

    }
}
