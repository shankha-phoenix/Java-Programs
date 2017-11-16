package UnionFind;

public class WeightedQuickUnionWithPathCompression {

    private int[] id;
    private int[] sz;

    public WeightedQuickUnionWithPathCompression(int N) {
        id = new int[N];
        sz = new int[N];

        for(int i=0; i<N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; //Path Compression
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return (root(p) == root(q));
    }

    public void union(int p, int q) {
        int rootp = root(p);
        int rootq = root(q);

        if(rootp == rootq)
            System.out.println("Already connected");

        if(sz[rootp] < sz[rootq]) {
            id[rootp] = rootq;
            sz[rootq] += sz[rootp];
        } else {
            id[rootq] = rootp;
            sz[rootp] += sz[rootq];
        }
    }
}
