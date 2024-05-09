package Graph;

public class Graph_CLient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 4, 1);
		g.addEdge(1, 2, 1);
		g.addEdge(3, 2, 2);
		g.addEdge(3, 4, 3);
		g.addEdge(4, 5, 4);
		g.addEdge(5, 6, 4);
		g.addEdge(5, 7, 5);
		g.addEdge(6, 7, 5);
		g.removeEdge(4, 5);
		g.removeEdge(1, 4);
		g.removeEdge(2, 3);
//		g.removeVertex(4);
//		System.out.println(g.hasPath(1,6));
//		System.out.println(g.bfs(1, 6));
//		System.out.println(g.dfs(1, 6));
//		g.display();
		g.dft();
	}

}
