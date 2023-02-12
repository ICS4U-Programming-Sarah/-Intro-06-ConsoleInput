import java.util.Scanner;
/**
* This program calculates the volume of a sphere, with a given radius.
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-09
*/

public final class ConsoleInput {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private ConsoleInput() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.println("Please enter the radius of the sphere (cm): ");
        final String userRadStr = scanner.nextLine();

        // Convert string to double
        final double userRadDouble = Double.parseDouble(userRadStr);

        // Seeing if satisfy conditions, if negative, end.
        if (userRadDouble >= 0) {
            // Calculate volume of sphere
            final double sphereVol = Math.PI * Math.pow(userRadDouble, 3);
            final double finalVolSph = sphereVol * (4f / 3f);

            /// Display to user
            System.out.println("The volume of the sphere with radius, ");
            System.out.print(userRadStr + " (cm) is: ");
            System.out.format("%.2f", finalVolSph);
            System.out.print(" cm^3.");
            System.out.println("");
        } else {
            System.out.println("Please enter a positive number.");
        }

        // Closes scanner
        scanner.close();
    }
}
