package NetworkPackage;

public class Link {
	
	// ******************* Attributes *******************
	public Node node1;
    public Node node2;
    public int weight;
    
    // ******************* Constructor *******************
    public Link(Node n1, Node n2, int w){
    	node1 = n1;
    	node2 = n2;
    	weight = w;
    }
    
    // ******************* Methods *******************
    // <empty... no need for it>
}
