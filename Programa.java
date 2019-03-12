// Declare from which package the class is from
package main;

// Import all the necessary classes
import NetworkPackage.Network;

public class Programa {

	public static void main(String[] args) {
		
		// Create/instantiate a Network object (called 'net')
		Network net = new Network();
		
		// add cities				// Indexes
		net.addNode("Lisboa");		// 0
		net.addNode("Faro");		// 1
		net.addNode("Sevilha");		// 2
		net.addNode("Madrid");		// 3
		net.addNode("Porto");		// 4
		net.addNode("Saragoça");	// 5
		net.addNode("Barcelona");	// 6
		net.addNode("Valência");	// 7
		
		
		// add links
		net.addLink(0, 1, 225);
		net.addLink(0, 4, 290);
		net.addLink(0, 3, 470);
		net.addLink(1, 2, 180);
		net.addLink(2, 3, 380);
		net.addLink(3, 4, 410);
		net.addLink(3, 7, 300);
		net.addLink(3, 5, 270);
		net.addLink(5, 6, 270);
		net.addLink(6, 7, 300);

		// Call the method 'distancesFromCity' from the class Network
		// It prints all the connections to city 3 (Madrid) with its respective distances
		net.distancesFromCity(3);
	}

}
