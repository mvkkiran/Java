package sample;

import java.io.*;
import java.util.*;

public class Solution {
  private static InputReader in;
  private static PrintWriter out;
  
  public static ArrayList<Edge>[] graph;
  
  static class Edge {
    public int to,weight;
    public Edge(int to, int weight) {
      this.to = to;
      this.weight = weight;
    }
  }

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);

    int n = in.nextInt(), m = in.nextInt();
    graph = new ArrayList[n];
    for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      int a = in.nextInt()-1, b = in.nextInt()-1, c = in.nextInt();
      graph[a].add(new Edge(b, c));
      graph[b].add(new Edge(a, c));
    }
    int a = in.nextInt()-1, b = in.nextInt()-1;
    vis2 = new boolean[n];
    if (!dfs(a,b)) out.println(-1);
    else {
      vis = new int[n];
      int forbidden = 0;
      vis = new int[n];
      for (int i = 30; i >= 0; i--) {
        curgen++;
        if (can(forbidden | (1 << i), a, b))
          forbidden |= 1 << i;
      }
      
      out.println(forbidden ^ ((1 << 31) - 1));
    }
    
    out.close();
    System.exit(0);
  }
  
  public static boolean[] vis2;
  public static boolean dfs(int node, int goal) {
    if (node == goal) return true;
    if (vis2[node]) return false;
    vis2[node] = true;
    for (Edge e : graph[node]) {
      if (dfs(e.to, goal)) return true;
    }
    return false;
  }

  public static int[] vis;
  public static int curgen;
  public static boolean can(int mask, int cur, int goal) {
    if (vis[cur] == curgen) return false;
    if (cur == goal) return true;
    vis[cur] = curgen;
    for (Edge x : graph[cur]) {
      if (vis[x.to] == curgen || (x.weight & mask) != 0) continue;
      if (can(mask, x.to, goal)) return true;
    }
    return false;
  }
  

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }


}
