import java.util.List;

/**
 * @author Javier Chavez
 *         10/30/2013
 *         Lab4
 */
public class Division implements Operator {
    @Override
    public int numArgs() {
        return 2;
    }

    @Override
    public double eval(List<Double> args) {
        return args.get(1) / args.get(0);
    }
}
