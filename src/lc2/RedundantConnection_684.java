package lc2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RedundantConnection_684 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] findRedundantConnection(int[][] edges) {
        int[] result = new int[2];
        HashSet<Integer> nodes = new HashSet();
        Map<Integer, List<Integer>> preEdges = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < edges.length; i++) {
            if (nodes.add(edges[i][0])) {
                List<Integer> l = new LinkedList<Integer>();
                l.add(edges[i][1]);
                nodes.add(edges[i][1]);
                preEdges.put(edges[i][0], l);
            } else if (preEdges.containsKey(edges[i][0])){
                
            }
        }
        return result;
    }

}
