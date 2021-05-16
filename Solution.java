import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int N = computers.length;
        int M = computers[0].length;
        int[][] visited = new int[N][M]; // 0 = not visited , 1 = visited
        
        // {i, j} 
        Queue<int[]> queue = new LinkedList<int[]>();
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(computers[i][j] == 1 && visited[i][j] == 0) {
                    int[] tempArr = {i, j};
                    queue.offer(tempArr);
                    visited[i][j] = 1;
                    answer++;
                }    
                while(!queue.isEmpty()) {
                    int[] curr = queue.remove();
                    int k = curr[0];

                    for(int l = 0; l < M; l++) {
                   
                        if(computers[k][l] + computers[l][k] == 2 && visited[l][k] == 0) {
                        	visited[k][l] = 1;
                        	visited[l][k] = 1;
                            
                            int[] ijArr = {k, l};
                            int[] jiArr = {l, k};
                            
                            queue.offer(ijArr);
                            queue.offer(jiArr);
                        }
                    }
                }
            }
        }
        return answer;
    }
 
}
