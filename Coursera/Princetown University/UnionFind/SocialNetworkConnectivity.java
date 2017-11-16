package UnionFind;

public class SocialNetworkConnectivity {

    private int[] id;

    public SocialNetworkConnectivity(int N, int[] tsp) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while(i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return (root(p) == root(q));
    }

    public static void main(String args[]) {
        int N = 10;
        int[] tsp = new int[N];
        int i = 0;
        SocialNetworkConnectivity snc = new SocialNetworkConnectivity(N,tsp);

        while(i<N) {
            boolean isConnected = snc.connected(0, N-1);
            i++;
            if(isConnected) {
                System.out.println(tsp[i]);
            }
        }
    }
}

