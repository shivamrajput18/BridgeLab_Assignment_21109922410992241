import java.util.Scanner; // Import Scanner for user input

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

    }
}
