
package exercise01;

/**
 * This class is created by Khyn Antoque
 */
public class Node {
    private Node nextNode;
    private int data;
    
    Node(){ }
    
    Node(int val, Node next) {
        data = val;
        nextNode = next;
    }

    /**
     * @return the nextNode
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }
    
    
}
