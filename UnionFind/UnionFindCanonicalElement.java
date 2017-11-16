package UnionFind;

import java.util.ArrayList;

public class UnionFindCanonicalElement {

    private int[] id;
    private int max;
    private ArrayList<Integer> connectedList;
    private ArrayList<ArrayList<Integer>> elementArray;

    public UnionFindCanonicalElement(int N) {
        id = new int[N];
        elementArray = new ArrayList<>(N);
        for(int i=0; i<N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        int j=0;
        while(i != id[i]) {
            i = id[i];
            connectedList.add(id[i]);
            j++;
        }
        elementArray.set(i,connectedList);
        return i;
    }

    public boolean connected(int p, int q) {
        return (root(p) == root(q));
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        id[pid] = qid;
    }

    public int find(int i) {
        connectedList = elementArray.get(i);
        max = connectedList.get(0);
        for (int item:connectedList) {
            if(max < item)
                max = item;
        }
        return max;
    }
}
