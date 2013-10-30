
import java.util.*;

public interface Operator {

    /**
     * How many arguments does this operator take?
     *
     * @return number of arguments required by this operator.
     */
    int numArgs();

    /**
     * Evaluate this operator using the given arguments.
     *
     * @param args Argument list.
     * @return Result of the operation.
     */
    double eval(List<Double> args);
}

