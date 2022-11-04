package Graph;

public class Graph {

    class Edge {
        String src, dest;
    }

    int vertices, edges;

    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        int noVertices = 12;
        int noEdges = 12;
        Graph myGraph = new Graph(noVertices, noEdges);

        // Edge 1 - Choose at least two of your friends that are also connected with each other.
        myGraph.edge[0].src = "Mike";
        myGraph.edge[0].dest = "James";

        // Edge 2 - Choose at least two of your friends that are also connected with each other.
        myGraph.edge[1].src = "Mike";
        myGraph.edge[1].dest = "Olea";

        // Edge 3 - Choose at least 1 person who is not directly connected with you but is connected with your friends in your network.
        myGraph.edge[2].src = "Mike";
        myGraph.edge[2].dest = "Tony";

        // Edge 4 - Choose at least 1 person who is not directly connected with you but is connected with your friends in your network.
        myGraph.edge[3].src = "Tony";
        myGraph.edge[3].dest = "Vien";

        // Edge 5
        myGraph.edge[4].src = "Mike";
        myGraph.edge[4].dest = "Saul";

        // Edge 6
        myGraph.edge[5].src = "Saul";
        myGraph.edge[5].dest = "Alex";

        // Edge 7
        myGraph.edge[6].src = "Alex";
        myGraph.edge[6].dest = "Kian";

        // Edge 8
        myGraph.edge[7].src = "Alex";
        myGraph.edge[7].dest = "Janon";

        // Edge 9
        myGraph.edge[8].src = "Mike";
        myGraph.edge[8].dest = "Janjo";

        // Edge 10
        myGraph.edge[9].src = "Janjo";
        myGraph.edge[9].dest = "Drin";

        // Edge 11
        myGraph.edge[10].src = "Olea";
        myGraph.edge[10].dest = "James";

        // Edge 12
        myGraph.edge[11].src = "James";
        myGraph.edge[11].dest = "Olea";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

        System.out.println("I am Mike, I am the main source.");
        System.out.println("1. Choose at least two of your friends that are also connected with each other: ");
            System.out.println("Mike - Olea");
            System.out.println("Mike - James");
            System.out.println("Olea - James");
            System.out.println("James - Olea");
        System.out.println("Choose at least 1 person who is not directly connected with you but is connected with your friends in your network.");
            System.out.println("Mike - Tony");
            System.out.println("Tony - Vien");
    }
}
