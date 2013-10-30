/**
 * @author Javier Chavez
 *         10/30/2013
 *         Lab4
 */


public class DoubleStack implements Stack<Double> {

    protected LLNode<Double> top;

    public DoubleStack() {
        top = null;
    }

    /**
     * Check to see if the stack is empty
     *
     * @return true if empty false not
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Save to the stack
     *
     * @param val is the value you want to save to the stack
     */
    @Override
    public void push(Double val) {
        //Order is very important! (null ends the list)
        LLNode<Double> node = top;
        //create the top node obj.
        top = new LLNode<Double>();
        //set the value of the top node
        top.setData(val);
        //set the top node to link to the "bottom" node
        top.setLink(node);
    }

    /**
     * Remove last element from stack
     *
     * @return the element that was removed
     */
    @Override
    public Double pop() {
        if (!isEmpty()) {
            double d = top.getData();
            top = top.getLink();
            return d;
        } else {
            return null;
        }
    }

    /**
     * Get the last added element without removing anything
     *
     * @return the last element in list
     */
    @Override
    public Double peek() {
        if (!isEmpty()) {
            return top.getData();
        } else {
            return null;
        }

    }
}
