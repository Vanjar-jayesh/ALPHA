package TopologicatSorting;

import java.util.ArrayList;
import java.util.Stack;

public class Quse01DFS {

    static class Edge{
    
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest=d;
        }
    }

    static void CreateGraph(ArrayList<Edge>[] graph){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2)); 
        
    }

    public static void topSort(ArrayList<Edge>[]graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if (!vis[i]) {
                topSOrtUtil( graph,i,vis,st);//modified DFS
            }
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }
    }


    public static void topSOrtUtil(ArrayList<Edge>[]graph,int curr,boolean vis[],Stack<Integer> st){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e =graph[curr].get(i);
            if (!vis[e.dest]) {
                topSOrtUtil(graph, e.dest, vis, st);
            }
        }

        st.push(curr);
    }
    public static void main(String[] args) {
        int V =6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);

        topSort(graph);
    }
}
