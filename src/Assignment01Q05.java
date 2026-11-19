public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int n = m.length;
        int[] queue = new int[n];
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        int head = 0;
        int tail = 0;
        queue[tail++] = i;
        visited[i] = true;
        dist[i] = 0;
        while (head < tail) {
            int curr = queue[head++];
            for (int next = 0; next < n; next++) {
                if (m[curr][next] == 1 && !visited[next]) {
                    dist[next] = dist[curr] + 1;
                    if (next == j) {
                        return dist[next];
                    }
                    visited[next] = true;
                    queue[tail++] = next;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}