import java.util.*;
class graph{
    static class edge{
        int src;
        int nbr;
        int wt;

        edge(int s, int n, int w){
            src = s; nbr = n; wt = w;
        }
    }

    public static void addEdge(ArrayList<ArrayList<edge>> graph, int a, int b, int w){
        graph.get(a).add(new edge(a,b,w));
        graph.get(b).add(new edge(b,a,w));
    }
    public static void display(ArrayList<ArrayList<edge>> graph){
        for(int v = 0; v< graph.size(); v++){
            System.out.print(v+" -> ");
            for(int e=0; e<graph.get(v).size();e++){
                edge ce = graph.get(v).get(e);
                System.out.print("["+ce.nbr+" @ "+ce.wt+" ] , ");
            }
            System.out.println();
        }
    }

    public static boolean hasPath(ArrayList<ArrayList<edge>> graph, int src, int dest, boolean[] visited){
        if(src == dest){
            return true;
        }
        visited[src] = true;
        for(int e = 0; e<graph.get(src).size(); e++){
            edge ce =  graph.get(src).get(e);
            if(visited[ce.nbr] == false){
                boolean recAns = hasPath(graph,ce.nbr,dest,visited);
                if(recAns){
                    return true;
                }
            }
        }
        visited[src] = false;
        return false;
    }
    public static void allPaths(ArrayList<ArrayList<edge>> graph, int src, int dest,String path,boolean[] visited){
        if(src == dest){
            System.out.println(path+src);
            return;
        }
        visited[src] = true;
        for(int e = 0; e<graph.get(src).size(); e++){
            edge ce =  graph.get(src).get(e);
            if(visited[ce.nbr] == false){
                allPaths(graph,ce.nbr,dest,path+src+" -> ",visited);
            }
        }
        visited[src] = false;
    }

    static int minCost = Integer.MAX_VALUE;
    static String minPath = "";
    static int maxCost = Integer.MIN_VALUE;
    static String maxPath = "";

    public static void MinAndMaxPath(ArrayList<ArrayList<edge>> graph, int src, int dest,String path,boolean[] visited, int cost){
        if(src == dest){
            path = path + src;
            if(cost < minCost){
                minCost = cost;
                minPath = path;
            }
            if(cost > maxCost){
                maxCost = cost;
                maxPath = path;
            }
            return;
        }
        visited[src] = true;
        for(int e = 0; e<graph.get(src).size(); e++){
            edge ce =  graph.get(src).get(e);
            if(visited[ce.nbr] == false){
                MinAndMaxPath(graph,ce.nbr,dest,path+src+" -> ",visited,cost+ce.wt);
            }
        }
        visited[src] = false;
    }
    static int ceilCost = Integer.MAX_VALUE;
    static String ceilPAth = "";
    static int floorCost = Integer.MIN_VALUE;
    static String floorPath = "";

    public static void CeilAndFloor(ArrayList<ArrayList<edge>> graph, int src, int dest,String path,boolean[] visited, int cost, int factor){
        if(src == dest){
            path = path + src;
            //ceil updation
            if(cost > factor){
                if(cost< ceilCost){
                    ceilCost = cost;
                    ceilPAth = path;
                }
            }
            if(cost< factor){
                if(cost> floorCost){
                    floorCost = cost;
                    floorPath = path;
                }
            }
            return;
        }
        visited[src] = true;
        for(int e = 0; e<graph.get(src).size(); e++){
            edge ce =  graph.get(src).get(e);
            if(visited[ce.nbr] == false){
                CeilAndFloor(graph,ce.nbr,dest,path+src+" -> ",visited,cost+ce.wt,factor);
            }
        }
        visited[src] = false;
    }

    public static void kthLargestPath(ArrayList<ArrayList<edge>> graph, int k){

        int factor = Integer.MAX_VALUE;
        String path = "";
        boolean[] visited = new boolean[graph.size()];
        for(int i = 0; i < k; i++ ){
            floorCost = Integer.MIN_VALUE;
            CeilAndFloor(graph,0,6,"",visited,0,factor);
            factor = floorCost;
            path = floorPath;
        }
        System.out.println(path + " @ " + factor);
    }

    public static void main(String[] args){
        ArrayList<ArrayList<edge>> graph = new ArrayList<>();

        for(int i= 0; i<7; i++){
            graph.add(new ArrayList<edge>());
        }
        addEdge(graph,0,1,10);
        addEdge(graph,0,3,40);
        addEdge(graph,1,2,10);
        addEdge(graph,2,3,10);
        addEdge(graph,3,4,2);
        addEdge(graph,4,5,3);
        addEdge(graph,4,6,8);
        addEdge(graph,5,6,3);
        // display(graph);
        boolean visited[] = new boolean[graph.size()]; 
        // System.out.println(hasPath(graph,0,6,visited));
        // allPaths(graph,0,6,"",visited);
        // MinAndMaxPath(graph,0,6,"",visited,0);
        // System.out.println(minPath + " @ " + minCost);
        // System.out.println(maxPath + " @ " + maxCost);
        // CeilAndFloor(graph,0,6,"",visited,0,45);
        // System.out.println(ceilPAth + " @ " + ceilCost);
        // System.out.println(floorPath + " @ " + floorCost);
        kthLargestPath(graph,3);
    }
}