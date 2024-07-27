import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class SnapshotArray {
    private List<TreeMap<Integer, Integer>> snapshots;
    private int snapCount;

    public SnapshotArray(int length) {
        this.snapshots = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            snapshots.add(new TreeMap<>());
            snapshots.get(i).put(0, 0); 
        }
        this.snapCount = 0;
    }
    
    public void set(int index, int val) {
        snapshots.get(index).put(snapCount, val);
    }
    
    public int snap() {
        return snapCount++;
    }
    
    public int get(int index, int snap_id) {
        
        return snapshots.get(index).floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */