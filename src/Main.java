import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(Integer.parseInt(scanner.nextLine()));
        System.out.println(circle);
    }
}