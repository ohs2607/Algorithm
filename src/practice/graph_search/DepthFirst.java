package practice.graph_search;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirst {
    
    static class Graph {
        int vertices; // 정점
        ArrayList<ArrayList<Integer>> adjList; // Adjacency 인접

        // 생성자
        Graph(int vertices){
            this.vertices = vertices;
            adjList = new ArrayList<>(vertices);

            for (int i=0; i<vertices; ++i){
                adjList.add(new ArrayList<>());
            }
        }

        // 노드 생성하는 메서드
        void addEdge(int source, int destination){
            adjList.get(source).add(destination);
        }

        void DFS(int startVertex){
            // 방문 확인용
            boolean[] visited = new boolean[vertices];

            // 스택 사용 (제일 먼저 들어간게 제일 나중에 나옴)
            Stack<Integer> stack = new Stack<>();

            // 시작 노드를 스택에 넣고 방문 체크
            stack.push(startVertex);
            visited[startVertex] = true;

            // 방문 확인했으면 꺼내기
            while (!stack.isEmpty()) {
                // 스택에서 노드를 꺼내서 출력
                int currentVertex = stack.pop();
                System.out.print(currentVertex + " ");

                // 현재 노드와 연결된 방문하지 않은 인접 노드를 스택에 넣고 방문 체크
                for (int neighbor : adjList.get(currentVertex)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                        visited[neighbor] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);

        // 아 트리를 그려주는 과정 - 상위 노드에 하위 노드를 연결하는 거싱고
        // source 가 부모노드, destination 이 자식 노드
        // 아래 예시는 가장 기본적인 트리 노드 형태
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(2,6);

        System.out.println("DFS starting from vertex 0: ");
        graph.DFS(0);

        // 어우 배고파 시작 정점이 0이라고 한거 아니야
    }

}
/*
0 2 6 5 1 4 3
*/