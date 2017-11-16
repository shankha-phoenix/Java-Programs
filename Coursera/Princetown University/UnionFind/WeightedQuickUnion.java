package UnionFind;

public class WeightedQuickUnion {

    private int[] id;
    private int[] sz;

    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];

        for(int i=0; i<N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    private int root(int i) {
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        if(root(p) == root(q)) {
            return true;
        } else {
            return false;
        }
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);

        if (pid == qid) {
            System.out.println("Already connected");
        }

        if (sz[pid] < sz[qid]) {
            id[pid] = qid;
            sz[qid] += sz[pid];
        } else {
            id[qid] = pid;
            sz[pid] += sz[qid];
        }
    }
}
