package ConnectedComponentsDFSBFS;

import java.util.ArrayList;

public class DFS {
      static class Edge
     {
        int src;
        int dest;
        int wt;

        public Edge(int s ,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;            
        }        
    }


static void CreateGraph(ArrayList<Edge> graph[]){

    for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
    }

    
    graph[0].add(new Edge(0, 1, 1));
    graph[0].add(new Edge(0, 2, 1));

    graph[1].add(new Edge(1, 0, 1));
    graph[1].add(new Edge(1, 3, 1));
    
    graph[2].add(new Edge(2, 0, 1));
    graph[2].add(new Edge(2, 4, 1));

    graph[3].add(new Edge(3, 1, 1));
    graph[3].add(new Edge(3, 4, 1));
    graph[3].add(new Edge(3, 5, 1));

    graph[4].add(new Edge(4, 2, 1));
    graph[4].add(new Edge(4, 3, 1));
    graph[4].add(new Edge(4, 5, 1));

    graph[5].add(new Edge(5, 3, 1));
    graph[5].add(new Edge(5, 4, 1));
    graph[5].add(new Edge(5, 6, 1));

    graph[6].add(new Edge(6, 5, 1));
}

    public static void Dfs(ArrayList<Edge> []graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            DfsUtil(graph, i, vis);
        }
    }

public static void DfsUtil(ArrayList<Edge> []graph,int curr,boolean vis[]){

    System.out.print(curr + " ");

    vis[curr] = true;

    for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if (!vis[e.dest]) {
            DfsUtil(graph,e.dest,vis);
        }
    }

}



    public static void main(String[] args) {
               /*
              *    1---3
                  /    | \
                 0     |  5--6
                 \     | /
                 2----4
             */


             int V = 7;
             ArrayList<Edge>Graph[] = new ArrayList[V];
             CreateGraph(Graph);
             DfsUtil(Graph, 0, new boolean[V]);
              
          
    }
}
