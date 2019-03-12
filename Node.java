package NetworkPackage;

import java.util.ArrayList;

public class Node {
	
	// ******************* Attributes *******************
	public int id;
	public String city_name;
    public ArrayList<Link> connections;
    
    // ******************* Constructor *******************
    public Node(int node_id, String name) {
    	id = node_id;
    	city_name = name;
    	
    	// We could also initialize this variable when we created it (in the Attributes section)
    	connections = new ArrayList<Link>();
    }
    
    // ******************* Methods *******************
    
    // Add 'link' (of type Link) to the list of links of the node
    public void addLink(Link link){
    	connections.add(link);
    }
}
