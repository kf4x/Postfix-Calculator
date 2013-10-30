import java.util.Scanner;

/**
 * @author Javier Chavez
 *         10/30/2013
 *         Lab4
 */

public class CalcTest {

    public static void main(String[] args) {
        // Create a scanner from standard input
        Scanner scanner = new Scanner(System.in);

        // Make a new calculator
        PostFixCalculator calc = new PostFixCalculator();

        // keep reading tokens until we run out.
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                // Next item is a double, so must be an operand
                calc.storeOperand(scanner.nextDouble());
            } else {
                // otherwise, we have an operator
                calc.evalOperator(scanner.next());
            }
        }
    }
}