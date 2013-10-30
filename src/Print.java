import java.util.List;

/**
 * @author Javier Chavez
 *         10/30/2013
 *         Lab4
 */

public class Print implements Operator {
    @Override
    public int numArgs() {
        return 1;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double eval(List<Double> args) {
        System.out.println(String.valueOf(args.get(0)));
        return args.get(0);
    }

}
