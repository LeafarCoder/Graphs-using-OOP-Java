package NetworkPackage;

import java.util.ArrayList;

public class Network {
	
	// ******************* Attributes *******************
	ArrayList<Node> nodes;
	int currentNodeID = 0;
	
	// ******************* Constructor *******************
	public Network(){
		nodes = new ArrayList<Node>();
	}
	
	// ******************* Methods *******************
	
	// This function allows us to add a Node to the Network (added in the 'nodes' attribute)
	// The argument 'name' refers to the name of the city in this specific case
	// No need to input the ID because it is handled by the Network itself (by the 'currentNodeID' variable)
	public void addNode(String name) {
		Node newNode = new Node(currentNodeID++, name);
		nodes.add(newNode);
	}
	
	// This functions adds a link to the Network (between with index 'node1ID' and node with index 'node2ID' with weight 'w')
	// The object 'Network' does not contain a vector to hold all the Links. Instead are added directly to the structure of the Nodes
	public void addLink(int node1ID, int node2ID, int w){
		
		// Get the objects 'node1' and 'node2' from the list of Nodes in the Network (access through the indexes)
		Node node1 = nodes.get(node1ID);
		Node node2 = nodes.get(node2ID);

		// Now create and add (in the same line of code) a Link with the information given above
		node1.addLink(new Link(node1, node2, w));
		node2.addLink(new Link(node2, node1, w));
	}
	
	// Displays the distances from a specific city (referenced with its index and not the name for easier access to the vectors) to all its neighbors
	public void distancesFromCity(int cityID){
		
		// Get the Node object that refers to the source city (by accessing the 'nodes' attribute of the Network) 
		Node cityNode = nodes.get(cityID);
		// Get the name of the source city (in the previous line we got the city node object, now we ask it one of its attributes (the name)) 
		String sourceCityName = cityNode.city_name;
		// We'll also need the number of connections to this city (so we can iterate through them)
		int numConnections = cityNode.connections.size();
		
		// Iterate through all the connections
		for(int i = 0; i < numConnections; i++) {
			// Get the name of the city the source city connects to
			String currentCityName = cityNode.connections.get(i).node2.city_name;
			// Get the weight (distance in this case) of the connection
			int dist = cityNode.connections.get(i).weight;
			
			// Print answer
			System.out.println("From " + sourceCityName + " to " + currentCityName + ": " + dist);
		}
	}
	
	
}
