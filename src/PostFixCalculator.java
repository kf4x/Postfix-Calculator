import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Javier Chavez
 *         10/30/2013
 *         Lab4
 */

public class PostFixCalculator {

    private DoubleStack stack = new DoubleStack();
    private Map<String, Operator> operatorMap = new HashMap<String, Operator>();

    public PostFixCalculator() {
        //fill Map with implemented operators and Map string val to op. val
        operatorMap.put("+", new Addition());
        operatorMap.put("add", new Addition());
        operatorMap.put("-", new Subtraction());
        operatorMap.put("sub", new Subtraction());
        operatorMap.put("*", new Multiplication());
        operatorMap.put("mult", new Multiplication());
        operatorMap.put("/", new Division());
        operatorMap.put("div", new Division());
        operatorMap.put("=", new Print());
        operatorMap.put("print", new Print());

    }

    /**
     * Save the operand
     *
     * @param v double value to be used during postfix
     */
    public void storeOperand(double v) {
        stack.push(v);
    }

    /**
     * Evaluates the operator and show result in console.
     *
     * @param v string representation of the operator
     */
    public void evalOperator(String v) {
        Double[] args;
        List l;

        //Check to see if string is in Map
        if (operatorMap.containsKey(v)) {
            //get the operator value based on the key
            Operator opp = operatorMap.get(v);
            //create array the same length as the args needed for the op.
            args = new Double[opp.numArgs()];
            //get the numbers from the stack
            for (int x = 0; x < opp.numArgs() && !stack.isEmpty(); x++) {
                //save the numbers in an array and remove from stack
                args[x] = stack.pop();
            }

            l = Arrays.asList(args);
            //pass the numbers to the operator and evaluate, then push to the stack
            stack.push(opp.eval(l));

        } else {
            System.out.println("Operator not recognized");
        }


    }
}
