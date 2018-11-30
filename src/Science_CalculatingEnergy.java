import java.util.Scanner;

public class Science_CalculatingEnergy {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in); // We need a scanner !

        /* The task will be performed in three major steps
        1) Prompting the user for defining parameters, declaring and assigning the parameters to defining variables
        2) Calculating essential variables from the defining variables
        3) Displaying the results to user
         */

        // 1) Prompting for parameters, declaring and assigning defining variables
        System.out.print(
                "Please enter the starting temperature 'tempS 'of the water: "
        );
        double tempS = input.nextDouble(); // Declaring and assigning the varable for the starting temperature

        System.out.print(
                "Please enter the end temperature 'tempE' of the water: "
        );
        double tempE = input.nextDouble(); // Declaring and assigning the variable for the ending temperature

        System.out.print(
                "Please enter the amount of water that needs to be heated: "
        );
        double water = input.nextDouble(); // Declaring and assigning the amount of water
    }
}
