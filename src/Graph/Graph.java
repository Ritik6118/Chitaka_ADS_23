package Graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	Graph() {
		map = new HashMap<>();
	}

	Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addVertex(int v) {
		map.put(v, new HashMap<>());
	}

	public void addEdge(int v1, int v2, int w) {
		map.get(v1).put(v2, w);
		map.get(v2).put(v1, w);
	}

	public boolean containVertex(int v) {
		return map.containsKey(v);
	}

	public boolean containsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public int getWeight(int v1, int v2) {
		return map.get(v1).get(v2);
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removeVertex(int v) {
		for (int i : map.get(v).keySet()) {
			map.get(i).remove(v);
		}
		map.remove(v);
	}

	public void display() {
		for (int i : map.keySet()) {
			System.out.println(i + " => " + map.get(i));
		}
	}

	public boolean hasPath(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		return hasPath(src, des, visited);
	}

	private boolean hasPath(int src, int des, HashSet<Integer> visited) {
		// TODO Auto-generated method stub
		if (src == des) {
			System.out.println("path Exist");
			return true;
		}
		visited.add(src);
		for (int i : map.get(src).keySet()) {
			if (!visited.contains(i)) {
				if (hasPath(i, des, visited)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean bfs(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		visited.add(src);
		while (!q.isEmpty()) {
			int n = q.poll();
			if (n == des) {
				return true;
			}
			for (int i : map.get(n).keySet()) {
				if (!visited.contains(i)) {
					q.add(i);
					visited.add(i);
				}
			}
		}
		return false;
	}

	public boolean dfs(int src,int des) {
		HashSet<Integer> visited=new HashSet<>();
		Stack<Integer> st=new Stack<>();
		st.add(src);
		visited.add(src);
		while(!st.isEmpty()) {
			int n=st.pop();
			if(n==des) {
				return true;
			}
			for(int i:map.get(n).keySet()) {
				if(!visited.contains(i)) {
					st.add(i);
					visited.add(i);
				}
			}
		}
		return false;
	}
	public void bft() {
		HashSet<Integer> visited =new HashSet<>();
		Queue<Integer> q=new LinkedList<>();
		int c=0;
		for(int i:map.keySet()) {
			if(!visited.contains(i)) {
				q.add(i);
				visited.add(i);
				while(!q.isEmpty()) {
					int n=q.poll();
					System.out.println(n);
					for(int j:map.get(n).keySet()) {
						if(!visited.contains(j)) {
							q.add(j);
							visited.add(j);
						}
					}
				}
				c++;
			}
		}
		System.out.println("no of components = "+ c);
	}
	public void dijkstra() {
		PriorityQueue<dijkstrapair> pq=new PriorityQueue<>(new Comparator<dijkstrapair>() {
			@Override
			public int compare(dijkstrapair p1,dijkstrapair p2) {
				return p1.cost-p2.cost;
			}
		});
		pq.add(new dijkstrapair(1,"",0));
		HashSet<Integer> visited=new HashSet<>();
		
		while(!pq.isEmpty()) {
			dijkstrapair pair=pq.poll();
			if(visited.contains(pair.vtx)) {
				continue;
			}
			visited.add(pair.vtx);
			System.out.println(pair);
			for(int i: map.get(pair.vtx).keySet()) {
				if(!visited.contains(i)) {
					dijkstrapair ndp=new dijkstrapair(i,pair.path+""+pair.vtx,pair.cost+map.get(pair.vtx).get(i));
					pq.add(ndp);
				}
			}
		}
	}
	public void prims() {
		PriorityQueue<primspair> pq=new PriorityQueue<>(new Comparator<primspair>() {
			@Override
			public int compare(primspair p1,primspair p2) {
				return p1.cost-p2.cost;
			}
		});
		pq.add(new primspair(1,1,0));
		HashSet<Integer> visited=new HashSet<>();
		
		while(!pq.isEmpty()) {
			primspair pair=pq.poll();
			if(visited.contains(pair.vtx)) {
				continue;
			}
			visited.add(pair.vtx);
			System.out.println(pair);
			for(int i: map.get(pair.vtx).keySet()) {
				if(!visited.contains(i)) {
					pq.add(new primspair(i,pair.vtx,map.get(pair.vtx).get(i)));
				}
			}
		}
	}
	public void dft() {
		HashSet<Integer> visited =new HashSet<>();
		Stack<Integer> st=new Stack<>();
		int c=0;
		for(int i:map.keySet()) {
			if(!visited.contains(i)) {
				st.add(i);
				visited.add(i);
				while(!st.isEmpty()) {
					int n=st.pop();
					System.out.println(n);
					for(int j:map.get(n).keySet()) {
						if(!visited.contains(j)) {
							st.add(j);
							visited.add(j);
						}
					}
				}
				c++;
			}
		}
		System.out.println("no of components = "+ c);
	}
}
class primspair{
	int vtx;
	int aqvtx;
	int cost;
	primspair(int v,int av,int c){
		vtx=v;
		aqvtx=av;
		cost=c;
	}
	@Override
	public String toString() {
		return ""+vtx+" via "+aqvtx+" @ "+cost;
	}
}
class dijkstrapair{
	int vtx;
	String path;
	int cost;
	dijkstrapair(int v,String av,int c){
		vtx=v;
		path=av;
		cost=c;
	}
	@Override
	public String toString() {
		return ""+vtx+" via "+path+" @ "+cost;
	}
}
