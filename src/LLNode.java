/**
 * @author Javier Chavez
 *         10/30/2013
 *         Lab4
 */

public class LLNode<T> {

    private LLNode link;
    private T data;

    public LLNode() {
        this.setData(null);
        this.setLink(null);
    }

    /**
     * get the link that this class is holding
     *
     * @return a link can be null
     */
    public LLNode getLink() {
        return link;
    }

    /**
     * @param link set the next element in list
     */
    public void setLink(LLNode link) {
        this.link = link;
    }

    /**
     * get the data that the node is holding
     *
     * @return return data stored
     */
    public T getData() {
        return data;
    }

    /**
     * set the data of the node
     *
     * @param data set the data to be stored
     */
    public void setData(T data) {
        this.data = data;
    }
}
