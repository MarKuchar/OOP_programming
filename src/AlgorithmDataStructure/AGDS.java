package AlgorithmDataStructure;

import com.sun.javafx.geom.Edge;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AGDS {
    static class Practice {
        static class Edge {
            int to;
            int distance;

            public Edge(int to, int distance) {
                this.to = to;
                this.distance = distance;
            }
        }

        public static int farthest = 1;

        public static int diameter() {
            Console console = System.console();
            Scanner myObj = new Scanner(System.in);

            int numOfV = Integer.parseInt(myObj.nextLine());
            ArrayList<Boolean> isVisited = new ArrayList<>(numOfV + 1);
            ArrayList<ArrayList<Edge>> adjList = new ArrayList<>(numOfV + 1);
            for (int i = 0; i <= numOfV; i++) {
                adjList.add(new ArrayList<Edge>());
                isVisited.add(false);
            }

            for (int i = 0; i < numOfV; i++) {
                ArrayList<String> line =  new ArrayList<String>(Arrays.asList(myObj.nextLine().split(" ")));
                int nodeA = Integer.parseInt(line.remove(0));
                while (Integer.parseInt(line.get(0)) != -1) {
                    int nodeB = Integer.parseInt(line.remove(0));
                    int distance = Integer.parseInt(line.remove(0));
                    adjList.get(nodeA).add(new Edge(nodeB, distance));
                }
            }

            Practice.BFS(1, isVisited, adjList);
            System.out.print(farthest);
            return 0;
        }

        public static void BFS(int node, ArrayList<Boolean> isVisited, ArrayList<ArrayList<Practice.Edge>> adjList) {
            isVisited.set(node, true);
            for (Practice.Edge edge : adjList.get(node)) {
                if (!isVisited.get(edge.to)) {
                    farthest = edge.to;
                    BFS(edge.to, isVisited, adjList);
                }
            }
        }
    }

    public static void main(String[] args) {
        Practice.diameter();
    }
}
