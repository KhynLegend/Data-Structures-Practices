
package exercise01;

/**
 * This class is created by Khyn Antoque
 */
public class AvailList {
    
    //Declare the first node in the list
    private Node root;
    
    //Declare the size of the list
    private int size;
    
    //When the class is instantiated: root will be a node that contains null and set the size to zero
    AvailList() {
        root = new Node();
        size = 0;
    }
    
    Node add(int data){
        
        //Create a new node that contains an int data and assign the node that contained null to be linked
        Node newNode = new Node(data, root);
        
        //Making the new addded node to be its root
        this.root = newNode;
        
        //Increment the size to one since we added a node bruh
        setSize(getSize() + 1);
        
        //Then it returns the added node's instance
        return newNode;
    }
    
    //This will find the int data you'll passed into it eg. find(13) 
    int find(int data) {
        
        //Create a temporary node to get the root, the first node
        Node temp = this.root;
        
        //Initialize the current index were into
        int index = 0;
        
        //Create a loop until it reaches into the node that contains null 
        //Since it was everytime the last node in the list
        while(temp != null)
            
            //If the node's data matches the data then it will return the current index
            if(temp.getData() == data)
                return index;
            else {
                
                //Else were goin to jump to the next node
                temp = temp.getNextNode();
                //Increment the current index by one if it doesn't matches the current node's value
                index++;
                
            }
        
        // if it doesn't find the data; it will return -1
        return -1;
        
    }
    
    //This will remove a data given to the parameters
    boolean remove(int data) {
        
        //Start in the first node right?!
        Node currentNode = this.root;
        //Previous node is null because there is no previous node on the first node
        Node prevNode = null;
        
        //While current node doesn't have nextNode(); check Node class and by the way
        //the node we instantiated during the instantiation of the AvailList is just node right; see Line 17
        //Well that's the last node like a=value, b=node  [ a | b==null]
        while(currentNode != null) {
            
            //If the current node's data matches to the data in the line 67 or with the remove's int data parameter
            if(currentNode.getData() == data){
                
                //The previous node will be re-initialized to currentNode's next node 
                //eg. node=[value | link] while link is the current node's link and not the current node
                //so it makes a sense that it skips the current node as the next node right?!
                prevNode.setNextNode(currentNode.getNextNode());
                
                //The decrease the size of the list by one
                this.setSize(this.getSize() - 1);
                //and returns true after it has being removed
                return true;
            }
            
            //if IF fails then it will makes the prevNode as the currentNode
            prevNode = currentNode;
            // and the current node will now have the previous' next node
            currentNode = prevNode.getNextNode();
            
        }
        
        //if the data that should be deleted can't be found then it returns false
        return false;
    }
    
    // This to string is being overriden to the superclass object but don't worry about it now
    @Override
    //We have this method to get the String form of our list so that we can print that into our console
    public String toString() {
        
        //Create a temp string to store the data every iteration of the while loop
        String data = "[";
        
        //Starts in the first node
        Node currentNode = this.root; 
        
        //While we don't reach the end of the list
        while(currentNode != null) {
            //Concatinate the current data to the string and add a comma on to it
            data += currentNode.getData() + ", ";
            //then jumps to the next node
            currentNode = currentNode.getNextNode();
            
        }
        
        //After that we assume that the last element have eg. "[ 1, 2, 3,"
        //so to remove that we use substring to remove the comma problem and adds "]" to the end
        return data.substring(0, data.length()-2) + "]";
    }
    
    /**
     * @return the size of the list
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the list's size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public static void main(String[] args) {
        
        //Sample tests made by me, you can customize this mah classmates
        AvailList aList = new AvailList();
        
        aList.add(12);
        System.out.println(aList.getSize());
        
        System.out.println(aList.find(13));
        
        aList.add(123);
        System.out.println(aList.getSize());
        
        aList.remove(123);
        System.out.println(aList.getSize());
        
        aList.add(9);
        System.out.println(aList.getSize());
        System.out.println(aList.toString());
    }
    
}
